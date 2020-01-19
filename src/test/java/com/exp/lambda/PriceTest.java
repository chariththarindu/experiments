package com.exp.lambda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PriceTest {

	//@Test
	void test() {
		
		Price priceFun = (int x, int y) -> x + y;
		System.out.println(priceFun.price(10, 20));
		
		
	}

	@Test
	void testRunnable() {
		
	
		Thread mythread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("yes....");
				
			}
		}) ;
		
		mythread.run();
		
		
		Thread mythread2 = new Thread( () -> System.out.print("test lambda"));
		mythread2.run();
	}
	
	
	
}
