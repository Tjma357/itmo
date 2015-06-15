package com.dz6;

public class District {
	private String dist;
	private int okato;
	private int code;

	public District() {
	}

	public District(String dist, int okato, int code) {
		super();
		this.dist = dist;
		this.okato = okato;
		this.code = code;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public int getOkato() {
		return okato;
	}

	public void setOkato(int okato) {
		this.okato = okato;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
