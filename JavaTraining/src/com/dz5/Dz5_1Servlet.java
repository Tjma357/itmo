package com.dz5;


import java.io.IOException;
import java.text.ParseException;

import javax.servlet.http.*;

import com.dz5.Questions;

@SuppressWarnings("serial")
public class Dz5_1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setCharacterEncoding("UTF-8");
		String var1 = req.getParameter("var1");
		Questions[] Mas = new Questions[3];
		for (int i = 0; i < 3; i++) {
			Mas[i] = new Questions(i + 1);
		}
		if (var1.equals("quest")) {
			int k = (int) (Math.random() * 3);
			resp.getWriter()
					.println(
							Mas[k].getQuest() + "<br>" + Mas[k].getAnsw()
									+ "<input id='num1' type='hidden' value='"
									+ (k+1)
									+ "'><br><input id='in1' type='text'>"
									+ "<button id='b2'>Проверить</button><br>"
									+ "<span id='out2'></span>"
									+ "<script> $('#b2').click(function() {"
									+ "var var2 = $('#in1').val(); "
									+ "var var3 = $('#num1').val(); "
									+ "$('#out2').load('/dz5_1?var1=answer&var2=' + var2 + '&var3=' + var3);});</script>");
		}
		if (var1.equals("answer")) {
			try{
				String var2 = req.getParameter("var2");
				int var3 = Integer.parseInt(req.getParameter("var3"));
				checkAnsw(Mas[var3-1], var2, var3, resp);
			}
			catch(MyException e) {
				resp.getWriter().println(e.getMessage());
			}
			catch(ParseException e) {
				resp.getWriter().println("Ошибка при вводе формата даты!");
			}
			catch(NumberFormatException e) {
				resp.getWriter().println("Ошибка при вводе числа!");
			}
			resp.getWriter().println();
		}
	}
	
	public static void checkAnsw(Questions q, String in1, int k, HttpServletResponse resp) throws MyException, ParseException, NumberFormatException {
		if (q.checkStr(in1, k)) {
			throw new MyException("Правильно!");
		} else
			throw new MyException("Неверно!");
	}
}
