package com.dz6;

public class Cinema {
	private String name;
	private District dist;
	private String adds;
	private String metro;

	public Cinema() {
	}

	public Cinema(String name, District dist, String adds, String metro) {
		super();
		this.name = name;
		this.dist = dist;
		this.adds = adds;
		this.metro = metro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDist() {
		return dist;
	}

	public void setDist(District dist) {
		this.dist = dist;
	}

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	public String getMetro() {
		return metro;
	}

	public void setMetro(String metro) {
		this.metro = metro;
	}
}
