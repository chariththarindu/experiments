package com.exp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Stream;



public class LambdaTest {

	public LambdaTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String ch = "charith";
		
		List<String> list = new ArrayList<String>();
		list.add("charith");
		list.add("test");
		list.add("ball");
		
		//list.stream().map(x , Comparator::reversed).
		
		String[] str = {"charith","Test","rAt","apple"};
		
		 Comparator<String> comp = (String::compareTo); 
		
		 Comparator<String> comp1 = (String::compareToIgnoreCase);
		 
		//Stream.of().forEach(Comparator::reversed);
		//Arrays.sort(str, (x,y)-> x.compareToIgnoreCase(y));
		//Arrays.sort(str , String::compareToIgnoreCase);
		Arrays.sort(str ,  comp1.reversed());
		Arrays.stream(str).forEach((x) -> System.out.println(x));
		//Stream.of(str).forEach(System.out::println);
	
		//Function fct =  (int x, int y) -> x + y ;
		//repeat(10, i -> System.out.println("Hello, World!" + (9-i)));
	}

	public static void repeat(int n , IntConsumer consumer ) {
		
		for(int i=0 ;i<n ;i++) {
			consumer.accept(i);
		}
	}
	
	public static void makeRepeat( ) {
		
		Runnable run = () -> {
			
		};
		
	}
	
	public static Comparator<String> reverse(Comparator<String> comp)
	{
	return (x, y) -> comp.compare(y, x);
	}	
}
