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
							"<b>���� �������:</b><br>������� ���� ����� �� ������ 1 �� ����� ���������������.<form "
									+ "action=\"html/z1/z1.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "2":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>������ ������ ��������� ������� �� ��������, ������, ����� ������."
									+ "<form action=\"html/z2/z2.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "2a":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>�������������� �������� ������� �� ��������.<form action="
									+ "\"html/z2a/z2a.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "3":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>����� ������� Unicode � �������� ���������� ��������.<form action="
									+ "\"html/z3/z3.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "3a":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>����� ������� ������ � �������� ���������� ��������.<form action="
									+ "\"html/z3a/z3a.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "4":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>������������ ������� ���������� �� �������.<form action=\"html/z4/"
									+ "z4.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "5":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>5. ������� � ������������.<form action=\"html/z5/z5.html\"><input"
									+ " type=\"submit\" value=\"�������>>\"></form>");
			break;
		case "6":
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>6. ������� � ������� ����� � ��������������� � CSV.<form action=\""
									+ "html/z6/z6.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		}
	}
}
