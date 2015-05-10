package com.dz3;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz3_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		String var2 = req.getParameter("var2");
		int min = 10, max = 10, k = 1;
		try {
			min = Integer.parseInt(var1);
			max = Integer.parseInt(var2);
		} catch (NumberFormatException e) {
			k = 0;
		}

		if ((k == 1) && (min >= 0) && (min <= 65535) && (max >= 0)
				&& (max <= 65535)) {
			if (min > max) {
				k = min;
				min = max;
				max = k;
			}

			resp.getWriter().println("<br><table width=\"100%\"><tr>");
			k = 1;
			int i, sh = 0;
			for (i = min; i <= max; i = min + sh * (max - min) / 99) {
				if (k == sh / 10) {
					resp.getWriter().println("</tr><tr>");
					k++;
				}
				resp.getWriter().println("<th>&#" + i + "</th>");
				sh++;
			}
		} else
			resp.getWriter().println("Данные введены неверно!");
	}
}