package com.exp.patterns.singleton;

public enum EnumSingleton {

	INATANCE;

	private String name;
	private int age;

	public void set(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void process() {
		System.out.println("name :- " + this.name + "age :- " + this.age);
	}

}
