package com.dz2;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz2_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		int a = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		int b = Integer.parseInt(var2);
		String var3 = req.getParameter("var3");
		int c = Integer.parseInt(var3);
		double x1, x2;
		int d = b * b - 4 * a * c;
		resp.getWriter().println("<br>");
		if (d < 0) {
			resp.getWriter().println("Корней нет");
		} else if (d == 0) {
			x1 = -b / (2 * a);
			resp.getWriter().println("1 корень:<br>" + x1);
		} else {
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			x2 = (-b + Math.sqrt(d)) / (2 * a);
			resp.getWriter().println("2 корня:<br>" + x1 + " и " + x2);
		}
	}
}