package com.exp.lambda;

public interface Price {

	int price( int a , int b);

	default int getPrice(int a, int b) {
		return a+b;
	}
	
	//String price(String a , String b);
}
