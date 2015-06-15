package com.dz4;

import java.io.IOException;
import javax.servlet.http.*;
import com.dz4.ship.ShipS;
import com.dz4.city.City;

@SuppressWarnings("serial")
public class Dz4_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		ShipS shi = new ShipS();
		shi.setShip();
		City cit = new City();
		if (var1.equals("new")) {
			resp.getWriter()
					.println(
							"Из какого города начнем?<br> <select id=\"s1\">"
									+ cit.SelCity("9")
									+ "</select> <script>$('#s1').change(function()"
									+ "{var var2 = $('#s1').val();"
									+ "$('#out0').load(\"/dz4_1?var1=setci&var2=\" + var2);});</script>");
		} else if (var1.equals("setci")) {
			String ci1 = req.getParameter("var2");
			resp.getWriter()
					.println(
							"<div id=\"out1\">Деньги: "
									+ shi.retGold(1)
									+ " Экю"
									+ "<input id=\"go1\" type=\"hidden\" value=\""
									+ shi.retGold(1)
									+ "\">"
									+ "<br>Корабль: "
									+ shi.retType(1)
									+ "<input id=\"sh1\" type=\"hidden\" value=\"1\">"
									+ "<br>Место в трюме под товар: "
									+ shi.retMaxves(1)
									+ "<br>Количество людей на корабле: "
									+ shi.retPeople(1)
									+ "</div>Город: "
									+ cit.RetCity(ci1)
									+ "<br>Выберите куда отправиться:<br> <select id=\"s3\">"
									+ "<option disabled selected>- Выбирете город -	</option>"
									+ cit.SelCity(ci1)
									+ "</select>"
									+ "<button id=\"b2\">Отправиться</button>"
									+ "<input id=\"ci1\" type=\"hidden\" value=\""
									+ ci1
									+ "\">"
									+ "<script>$('#b2').click(function() {"
									+ " var var2 = $('#ci1').val();"
									+ " var var3 = $('#go1').val();"
									+ " var var4 = $('#sh1').val();"
									+ " var var5 = $('#s3').val();"
									+ " $('#out0').load(\"/dz4_1?var1=go&var2=\" + var2 + \"&var3=\""
									+ " + var3 + \"&var4=\" + var4 + \"&var5=\" + var5); });</script></div>");
		} else if (var1.equals("go")) {
			String ci1 = req.getParameter("var2");
			int go1 = Integer.parseInt(req.getParameter("var3"));
			int sh1 = Integer.parseInt(req.getParameter("var4"));
			String ci2 = req.getParameter("var5");
			go1 = (int) (go1 + cit.Got(shi.retMaxves(sh1), shi.retPeople(sh1), shi.retSpeed(sh1), ci1, ci2));
			resp.getWriter()
					.println(
							"<div id=\"out1\">Деньги: "
									+ go1
									+ " Экю"
									+ "<input id=\"go1\" type=\"hidden\" value=\""
									+ go1
									+ "\">"
									+ "<br>Корабль: "
									+ shi.retType(sh1)
									+ "<input id=\"sh1\" type=\"hidden\" value=\""
									+ sh1
									+ "\">"
									+ "<br>Место в трюме под товар: "
									+ shi.retMaxves(sh1)
									+ "<br>Количество людей на корабле: "
									+ shi.retPeople(sh1)
									+ "</div>Город: "
									+ cit.RetCity(ci2)
									+ "<br>Выберите куда отправиться:<br> <select id=\"s3\">"
									+ "<option disabled selected>- Выбирете город -	</option>"
									+ cit.SelCity(ci2)
									+ "</select>"
									+ "<button id=\"b2\">Отправиться</button>"
									+ "<input id=\"ci1\" type=\"hidden\" value=\""
									+ ci2
									+ "\">"
									+ "<script>$('#b2').click(function() {"
									+ " var var2 = $('#ci1').val();"
									+ " var var3 = $('#go1').val();"
									+ " var var4 = $('#sh1').val();"
									+ " var var5 = $('#s3').val();"
									+ " $('#out0').load(\"/dz4_1?var1=go&var2=\" + var2 + \"&var3=\""
									+ " + var3 + \"&var4=\" + var4 + \"&var5=\" + var5); });</script>");
		} else if (var1.equals("buy1")) {
			// String ci1 = req.getParameter("var2");
			int go1 = Integer.parseInt(req.getParameter("var3"));
			int sh1 = Integer.parseInt(req.getParameter("var4"));
			int sh2 = Integer.parseInt(req.getParameter("var5"));
			int go2 = shi.buyShip(sh1, sh2);
			if (go1 < go2)
				resp.getWriter().println(" Недостаточно денег!");
			else
				resp.getWriter()
						.println(
								"<button id = \"bb1\">Купить</button>"
										+ "<script>$('#bb1').click(function()"
										+ "{var var2 = $('#ci1').val(); "
										+ "var var3 = $('#go1').val(); "
										+ "var var4 = $('#sh1').val(); "
										+ "var var5 = $('#s2').val(); "
										+ "$('#out1').load(\"/dz4_1?var1=buy2&var2=\" + var2 + \"&var3=\""
										+ " + var3 + \"&var4=\" + var4 + \"&var5=\" + var5); });</script>");
		} else if (var1.equals("buy2")) {
			// String ci1 = req.getParameter("var2");
			int go1 = Integer.parseInt(req.getParameter("var3"));
			int sh1 = Integer.parseInt(req.getParameter("var4"));
			int sh2 = Integer.parseInt(req.getParameter("var5"));
			int go2 = shi.buyShip(sh1, sh2);
			go2 = go1 - go2;
			resp.getWriter().println(
					"Деньги: " + go2 + " Экю"
							+ "<input id=\"go1\" type=\"hidden\" value=\""
							+ go2 + "\">" + "<br>Корабль: " + shi.retType(sh2)
							+ "<input id=\"sh1\" type=\"hidden\" value=\""
							+ sh2 + "\">" + "<br>Место в трюме под товар: "
							+ shi.retMaxves(sh2)
							+ "<br>Количество людей на корабле: "
							+ shi.retPeople(sh2));
		}
	}
}
