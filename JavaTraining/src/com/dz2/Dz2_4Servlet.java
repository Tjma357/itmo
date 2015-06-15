package com.dz2;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz2_4Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		int[][] m = new int[5][8];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 199 - 99);
			}
		}
		int max = -100;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				resp.getWriter().println(m[i][j] + " ");
				if (max < m[i][j])
					max = m[i][j];
			}
			resp.getWriter().println("<br>");
		}
		resp.getWriter().println("<br>Максимальное число:" + max);
	}
}