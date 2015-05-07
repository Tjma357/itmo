package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JavaTrainingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String var1 = req.getParameter("var1");
		int s = Integer.parseInt(var1);
		resp.setCharacterEncoding("UTF-8");
		switch (s) {
		case 1:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Создать Гугл карту по Лекции 1 со своим форматированием.<form "
									+ "action=\"html/z1/index.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 2:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Изучив пример выполнить задания по массивам, циклам, типам данных."
									+ "<form action=\"html/z2/index.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 3:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Вывод таблицы Unicode в заданном промежутке значений.<form action="
									+ "\"html/z3/index.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 4:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Организовать систему основанную на классах.<form action=\"html/z4/"
									+ "index.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 5:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>5. Задание с исключениями.<form action=\"html/z5/index.html\"><input"
									+ " type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 6:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>6. Задание с чтением файла и преобразованием в CSV.<form action=\""
									+ "html/z6/index.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case 7:
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Индивидуальное финальное задание.<form action=\"html/z7/index.html"
									+ "\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		}
	}
}
