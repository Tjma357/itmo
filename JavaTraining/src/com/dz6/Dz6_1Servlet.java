package com.dz6;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

import com.opencsv.CSVReader;

@SuppressWarnings("serial")
public class Dz6_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		int code = Integer.parseInt(req.getParameter("code"));
		if (code == 0) {
			try {
				URL url = new URL(
						"https://javatraining-tjma357.appspot.com/files/Division.csv");
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(url.openStream(), "UTF-8"));

				resp.getWriter()
						.println(
								"<b>Выберете район</b>"
										+ "<table BORDER=1 CELLSPACING=0 CELLPADDING=5><tr><td>Название района</td>"
										+ "<td>ОКАТО</td><td>Код района</td></tr>");
				String line = reader.readLine();
				while ((line = reader.readLine()) != null) {
					String[] values = line.split(",");
					resp.getWriter().println(
							"<tr><td>"
									+ "<a TARGET='_blank' HREF='/dz6_1?code="
									+ values[2] + "'>" + values[0]
									+ "</a></td><td>" + values[1] + "</td><td>"
									+ values[2] + "</td>");
				}
				reader.close();
				resp.getWriter().println("</table>");
			} catch (IOException e) {
				resp.getWriter().println("Ошибка чтения файла!");
			}

		} else {
			ArrayList<District> districts = new ArrayList<District>();
			District dist0 = new District();
			dist0.setDist("Неизвестный");
			dist0.setOkato(0);
			dist0.setCode(0);
			districts.add(dist0);

			ArrayList<Cinema> cinemas = new ArrayList<Cinema>();
			try {
				URL url = new URL(
						"https://javatraining-tjma357.appspot.com/files/Division.csv");
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(url.openStream(), "UTF-8"));
				String line = reader.readLine();

				while ((line = reader.readLine()) != null) {
					String[] values = line.split(",");
					District dist = new District();
					dist.setDist(values[0]);
					dist.setOkato(Integer.parseInt(values[1]));
					dist.setCode(Integer.parseInt(values[2]));
					districts.add(dist);
				}
				reader.close();
			} catch (IOException e) {
				resp.getWriter().println("Не могу прочитать файл районов.");
			}

			if (!districts.isEmpty()) {
				try {
					URL url = new URL(
							"https://javatraining-tjma357.appspot.com/files/Cinema.csv");
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(url.openStream(), "UTF-8"));
					CSVReader csv = new CSVReader(reader);
					List<String[]> rows = csv.readAll();

					for (String[] row : rows) {
						Cinema cinema = new Cinema();
						cinema.setName(row[1]);
						cinema.setDist(Utils.getDistrictByName(districts,
								row[5]));
						cinema.setAdds(row[9]);
						cinema.setMetro(row[10]);
						cinemas.add(cinema);
					}
					csv.close();
					reader.close();
				} catch (IOException e) {
					resp.getWriter().println(
							"Не могу прочитать файл кинотетров.");
				}
			}

			if (!cinemas.isEmpty()) {
				resp.getWriter()
						.println(
								"СПб - <b>"
										+ Utils.getDistrictNameByCode(
												districts, code)
										+ " район</b> - Кинотетры:"
										+ "<table BORDER=1 CELLSPACING=0 CELLPADDING=5><tr><td>Название</td><td>Адрес</td><td>Метро</td></tr>");
				int i = 0;
				for (Cinema cinema : cinemas) {
					if ((code == cinema.getDist().getCode())&&(!cinema.getMetro().isEmpty())) {
						resp.getWriter().println(
								"<tr><td>" + ++i + ". " + cinema.getName()
										+ "</td><td>" + cinema.getAdds()
										+ "</td><td>" + cinema.getMetro()
										+ "</td></tr>");
					}
				}
				for (Cinema cinema : cinemas) {
					if ((code == cinema.getDist().getCode())&&(cinema.getMetro().isEmpty())) {
						resp.getWriter().println(
								"<tr><td>" + ++i + ". " + cinema.getName()
										+ "</td><td>" + cinema.getAdds()
										+ "</td><td>" + cinema.getMetro()
										+ "</td></tr>");
					}
				}
				resp.getWriter().println("</ol></table>");
			}
		}
	}
}
