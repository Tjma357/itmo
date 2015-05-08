package com.dz2a;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Dz2a_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		int ik = Integer.parseInt(var1);
		ik--;
		int[][] m = new int[6][6];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 20);
			}
		}
		switch (ik) {
		case 0: // сортировка
		{
			resp.getWriter().println("<br>До: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
			}
			boolean f = true;
			int k;
			while (f) {
				f = false;
				for (int j = 1; j < m[ik].length; j++) {
					if (m[ik][j - 1] > m[ik][j]) {
						f = true;
						k = m[ik][j - 1];
						m[ik][j - 1] = m[ik][j];
						m[ik][j] = k;
					}
				}
			}
			resp.getWriter().println("<br>После: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
			}
			break;
		}
		case 1: // массив в обратном порядке
		{
			resp.getWriter().println("<br>До: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
			}
			resp.getWriter().println("<br>После: ");
			for (int j = m[ik].length - 1; j >= 0; j--) {
				resp.getWriter().println(m[ik][j] + " ");
			}
			break;
		}
		case 2: // двумерный массив
		{
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					resp.getWriter().println(m[i][j] + " ");
				}
				resp.getWriter().println("<br>");
			}
			break;
		}
		case 3: // найти в массиве число и вывести на каком оно месте
		{
			boolean f = false;
			int k = 2, s = -2;
			resp.getWriter().println("<br>Массив: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
				if ((m[ik][j] == k) & (!f)) {
					s = j;
					f = true;
				}
			}
			if (s == -2) {
				resp.getWriter().println("<br>Не найдено.");
			} else
				resp.getWriter().println("<br>На " + (s + 1) + " месте.");
			break;
		}
		case 4: // элементы которые делятся на 2
		{
			resp.getWriter().println("<br>Массив: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
			}
			resp.getWriter().println("<br>Элементы: ");
			for (int j = 0; j < m[ik].length; j++) {
				if (m[ik][j] % 2 == 0)
					resp.getWriter().println(m[ik][j] + " ");
			}
			break;
		}
		case 5: // макс и мин в массиве
		{
			int max = 0, min = 20;
			resp.getWriter().println("<br>Массив: ");
			for (int j = 0; j < m[ik].length; j++) {
				resp.getWriter().println(m[ik][j] + " ");
				if (max < m[ik][j]) {
					max = m[ik][j];
				} else if (min > m[ik][j]) {
					min = m[ik][j];
				}
			}
			resp.getWriter().println("<br>max: " + min + "; min:" + max);
			break;
		}
		}

	}
}