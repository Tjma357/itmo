package com.dz3;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz3_2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String var1 = req.getParameter("var1");
		int min = Integer.parseInt(var1);
		String var2 = req.getParameter("var2");
		int max = Integer.parseInt(var2);
		int k;
		if (min > max) {
			k = min;
			min = max;
			max = k;
		}
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().println("<br><table width=\"100%\"><tr>");
		k = 1;
		int sh = (max - min) / 100;
		if (sh < 1)
			sh = 1;
		for (int i = min; i <= max; i = i + sh) {
			if (k == ((i - min) / 10 / sh)) {
				resp.getWriter().println("</tr><tr>");
				k++;
			}
			resp.getWriter().println(
					"<th>&#" + i + " | " + i + " | " + IntHex(i) + "</th>");
		}
	}

	public String IntHex(int k) {
		String s = "";
		while (k > 0) {
			if (k % 16 > 9) {
				s = (char) ((int) ('a') + k % 16 - 10) + s;
			} else
				s = (char) ((int) ('0') + k % 16) + s;
			k = k / 16;
		}
		return s;
	}
}