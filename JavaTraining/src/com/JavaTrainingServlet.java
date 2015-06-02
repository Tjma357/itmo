package com;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class JavaTrainingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String s = req.getParameter("var1");
		switch (s) {
		case "1":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Создать Гугл карту по Лекции 1 со своим форматированием.<form "
									+ "action=\"html/z1/z1.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "2":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Изучив пример выполнить задания по массивам, циклам, типам данных."
									+ "<form action=\"html/z2/z2.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "2a":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Дополнительное домашнее задание по массивам.<form action="
									+ "\"html/z2a/z2a.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "3":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Вывод таблицы Unicode в заданном промежутке значений.<form action="
									+ "\"html/z3/z3.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "3a":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Вывод таблицы цветов в заданном промежутке значений.<form action="
									+ "\"html/z3a/z3a.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "4":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>Организовать систему основанную на классах.<form action=\"html/z4/"
									+ "z4.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "5":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>5. Задание с исключениями.<form action=\"html/z5/z5.html\"><input"
									+ " type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		case "6":
			resp.getWriter()
					.println(
							"<b>Суть задания:</b><br>6. Задание с чтением файла и преобразованием в CSV.<form action=\""
									+ "html/z6/z6.html\"><input type=\"submit\" value=\"Перейти>>\"></form>");
			break;
		}
	}
}
