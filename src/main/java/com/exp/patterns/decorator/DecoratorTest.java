package com.exp.patterns.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		
		Beverage milkTea = new Tea();
		System.out.println(milkTea.cost());
		milkTea = new Milk(milkTea);
		milkTea = new Vanila(milkTea);
		System.out.println(milkTea.cost() + "get description :-" + milkTea.description);

		
		
	}

}
