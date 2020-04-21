package com.exp.patterns.prototype;

public class TestProtoType {

	public static void main(String[] args) {
		
		Sheep sheep = new Sheep();
		
		CloneFactory fac = new CloneFactory();
		
		Animal cloneSheep = (Sheep) fac.getClone(sheep);
		
		System.out.println(sheep);

		System.out.println(cloneSheep);
		
		System.out.println("has code " + System.identityHashCode(System.identityHashCode(sheep)));
		System.out.println("has code cloned  " + System.identityHashCode(System.identityHashCode(cloneSheep)));
	}

}
