package com.exp.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class ArithMaticOperationTest {



	@Test
	void test() {
	 Integer [] a = {1,4,5,3,4,7,4,23,12,34,45,24,9,8};
	 Arrays.parallelSort(a );
	 ArrayList<Integer> ab = new ArrayList<Integer>(List.of(a));
	 Collections.reverse(ab);
	 
	 Arrays.stream(a).forEach(x-> System.out.println(x));
	 System.out.println("///////////////");
	 ab.forEach(x->System.out.println(x));
	 
	 List<User> list = Collections.emptyList();
	 
	 
	}

}
