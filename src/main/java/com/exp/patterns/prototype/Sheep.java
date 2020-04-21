package com.exp.patterns.prototype;

public class Sheep implements Animal{
	
	public Sheep() {
		System.out.println("sheep is made...");
	}

	@Override
	public Animal makeCopy() {
	 System.out.println("make copy of sheep object..");
	 Sheep sh = null;
		try {
			 sh = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return sh;
	}

	public String toString() {
		return "doly is a sheep...!";
		
	}
}
