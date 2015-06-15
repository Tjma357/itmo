package com.dz4.ship;

public class ShipS {
	private Ship[] shi = new Ship[4];

	public void setShip() {
		for (int i = 0; i < 4; i++)
			shi[i] = new Ship();
		shi[0].settype("Шхуна");
		shi[0].setgold(4000);
		shi[0].setspeed(138);
		shi[0].setmaxves(50);
		shi[0].setpeople(16);
		shi[1].settype("Ост-Индийский торговец");
		shi[1].setgold(13670);
		shi[1].setspeed(60);
		shi[1].setmaxves(200);
		shi[1].setpeople(70);
		shi[2].settype("Бриг");
		shi[2].setgold(15800);
		shi[2].setspeed(175);
		shi[2].setmaxves(70);
		shi[2].setpeople(110);
		shi[3].settype("Фрегат");
		shi[3].setgold(24650);
		shi[3].setspeed(120);
		shi[3].setmaxves(130);
		shi[3].setpeople(150);
	}

	public String retType(int k) {
		String s = "<select id=\"s2\">" + "<option disabled selected>"
				+ shi[k - 1].gettype() + "</optin>";
		for (int i = 1; i <= 4; i++)
			if (i != k)
				s = s + "<option value=\"" + i + "\">" + shi[i - 1].gettype()
						+ "</option>";
		s = s
				+ "</select><span id=\"out2\"></span><script>$('#s2').change(function()"
				+ "{var var2 = $('#ci1').val(); "
				+ "var var3 = $('#go1').val(); "
				+ "var var4 = $('#sh1').val(); "
				+ "var var5 = $('#s2').val(); "
				+ "$('#out2').load(\"/dz4_1?var1=buy1&var2=\" + var2 + \"&var3=\""
				+ " + var3 + \"&var4=\" + var4 + \"&var5=\" + var5); });</script>";
		return s;
	}

	public int retSpeed(int k) {
		return shi[k - 1].getspeed();
	}

	public int retGold(int k) {
		return shi[k - 1].getgold();
	}

	public int retMaxves(int k) {
		return shi[k - 1].getmaxves();
	}
	
	public int retPeople(int k) {
		return shi[k - 1].getpeople();
	}

	public int buyShip(int i, int j) {
		return (shi[j - 1].getgold() - (shi[i - 1].getgold()) / 2);
	}
}
