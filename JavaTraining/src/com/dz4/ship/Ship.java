package com.dz4.ship;

public class Ship {
	private String type = "";
	private int speed = 0;
	private int maxves = 0;
	private int gold = 0;
	private int people = 0;
	
	public void settype(String s){
		this.type = s;
	}
	public void setspeed(int k){
		this.speed = k;
	}
	public void setmaxves(int k){
		this.maxves = k;
	}
	public void setgold(int k){
		this.gold = k;
	}
	public void setpeople(int k){
		this.people = k;
	}
	
	public String gettype(){
		return this.type;
	}
	public int getspeed(){
		return this.speed;
	}
	public int getmaxves(){
		return this.maxves;
	}
	public int getgold(){
		return this.gold;
	}
	public int getpeople(){
		return this.people;
	}
}