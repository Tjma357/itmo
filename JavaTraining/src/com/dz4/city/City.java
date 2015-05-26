package com.dz4.city;

public class City {
	private String[] ci = { "Сивилья", "Бриджтаун", "Порт-о-Пренс", "Гавана",
			"Нью-Йорк", "Бостон", "Ливерпуль", "Бордо" };
	private double[][] koord = {{37.389092, -5.984459},{13.113222, -59.598809},{18.533333, -72.333333},{23.159167, -82.271056},{40.712784, -74.005941},{42.360083, -71.05888},{53.408371, -2.99157},{44.837789, -0.57918}};

	public String RetCity(String s) {
		int k = Integer.parseInt(s);
		return ci[k - 1];
	}

	public String SelCity(String s) {
		String rez = "";
		int k = Integer.parseInt(s);
		for (int i=1; i<=8; i++) 
			if (i!=k) rez = rez + "<option value=\""+i+"\">"+ci[i-1]+"</option>";
		return rez;
	}
	
	public int Got (int ves, int people, int speed, String s1, String s2) {
		int cit1 = Integer.parseInt(s1);
		int cit2 = Integer.parseInt(s2);
		double rast = Math.sqrt((Math.pow((koord[cit1-1][0]-koord[cit2-1][0]), 2))+(Math.pow((koord[cit1-1][1]-koord[cit2-1][1]), 2)));
		int s = (int)(ves*rast/2 - rast*people/speed);
		return s;
	}
}
