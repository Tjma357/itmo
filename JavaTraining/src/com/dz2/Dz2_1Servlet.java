package com.dz2;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz2_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		double m = Double.parseDouble(var1);
		String var2 = req.getParameter("var2");
		double n = Double.parseDouble(var2);
		if (Math.abs(m - 10) < Math.abs(n - 10)) {
			resp.getWriter().println(" " + m);
		} else
			resp.getWriter().println(" " + n);
	}
}