package com.exp.patterns.stratergy;

public abstract class Animal {
	
	private String color;
	private String food;

	private Fly flyType;
	
	public  Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public Fly getFlyType() {
		return flyType;
	}

	public void setFlyType(Fly flyType) {
		this.flyType = flyType;
	}

	
	

	
}
