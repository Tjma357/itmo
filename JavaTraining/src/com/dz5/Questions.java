package com.dz5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Questions {
	private String quest = null;
	private String answer = null;

	public Questions(int k) {
		if (k==1) {
			this.quest = "Как зовут Сережу?";
			this.answer = "Сережа";
		}
		if (k==2) {
			this.quest = "Когда день рождение у Тани?";
			this.answer = "06.06.1994";
		}
		if (k==3) {
			this.quest = "Сколько у Славы глаз?";
			this.answer = "3";
		}
	}
	
	public String getQuest() {
		return this.quest;
	}
	public String getAnsw() {
		return this.answer;
	}
	
	public boolean checkStr(String answ, int k) throws MyException,
			ParseException, NumberFormatException {
		if (k == 1) {
			if (!this.answer.equals(answ)) {
				return false;
			}
		}
		if (k == 2) {
			SimpleDateFormat myDateFormat = new SimpleDateFormat("dd.mm.yyyy");
			Date userDate = myDateFormat.parse(answ);
			Date realDate = myDateFormat.parse(this.answer);
			if (!userDate.equals(realDate)){
				return false;
			}
		}
		if (k == 3) {
			if(Integer.parseInt(this.answer) != Integer.parseInt(answ)){
				return false;
			}
		}
		return true;
	}
}
