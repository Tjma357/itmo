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
							"<b>���� �������:</b><br>������� ���� ����� �� ������ 1 �� ����� ���������������.<form "
									+ "action=\"html/z1/index.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 2:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>������ ������ ��������� ������� �� ��������, ������, ����� ������."
									+ "<form action=\"html/z2/index.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 3:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>����� ������� Unicode � �������� ���������� ��������.<form action="
									+ "\"html/z3/index.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 4:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>������������ ������� ���������� �� �������.<form action=\"html/z4/"
									+ "index.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 5:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>5. ������� � ������������.<form action=\"html/z5/index.html\"><input"
									+ " type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 6:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>6. ������� � ������� ����� � ��������������� � CSV.<form action=\""
									+ "html/z6/index.html\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		case 7:
			resp.getWriter()
					.println(
							"<b>���� �������:</b><br>�������������� ��������� �������.<form action=\"html/z7/index.html"
									+ "\"><input type=\"submit\" value=\"�������>>\"></form>");
			break;
		}
	}
}
