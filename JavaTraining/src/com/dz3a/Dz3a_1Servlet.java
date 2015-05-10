package com.dz3a;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz3a_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		String var2 = req.getParameter("var2");
		String var3 = req.getParameter("var3");
		int min = -1, max = -1, t, sh = 1;
		try {
			min = Integer.parseInt(var1, 16);
			max = Integer.parseInt(var2, 16);
			sh = Integer.parseInt(var3);
			if (min > max) {
				t = min;
				min = max;
				max = t;
			}
			t = 1;
		} catch (NumberFormatException e) {
			t = 0;
		}

		if ((t == 0) || (sh < 1) || (min < 0x0) || (max > 0xFFFFFF)) {
			resp.getWriter().println("Данные введены неверно!");
		} else {
			resp.getWriter().println("<br><table width=\"100%\"><tr>");
			if (sh > 1) {
				for (int i = 1; i < sh + 1; i++) {
					int k = min + (i - 1) * (max - min) / (sh - 1);
					if (t == ((i - 1) / 10)) {
						resp.getWriter().println("</tr><tr>");
						t++;
					}
					resp.getWriter().println(
							"<th BGCOLOR=\"" + Integer.toHexString(k) + "\">"
									+ Integer.toHexString(k) + "</th>");
				}
			} else
				resp.getWriter().println(
						"<th BGCOLOR=\"" + Integer.toHexString((max - min) / 2)
								+ "\">" + Integer.toHexString((max - min) / 2)
								+ "</th>");
			resp.getWriter().println("</tr></table>");
		}
	}
}
