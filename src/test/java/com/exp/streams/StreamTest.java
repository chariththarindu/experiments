package com.exp.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StreamTest {

	@Test
	@Disabled
	void testIntStream() {

		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
	}

	// @Test
	void testSkipStream() {

		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));

	}

	// @Test
	void testSkipStreamSum() {

		System.out.println(IntStream.range(1, 10).skip(5).sum());

	}

	// @Test
	void testStreamString() {
		Stream.of("Ava", "Anert", "Alberto").sorted().findFirst().ifPresent(x -> System.out.println(x));

		// System.out.println(IntStream.range(1, 10).skip(5).sum());

	}

	// @Test
	void testStreamStringArray() {

		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah" };

		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

		// Stream.of("Ava","Anert" ,"Alberto").sorted().findFirst().ifPresent(
		// x->System.out.println(x));

		// System.out.println(IntStream.range(1, 10).skip(5).sum());

	}

	// @Test
	void testStreamIntArray() {

		Arrays.stream(new int[] { 2, 3, 4, 5, 6, 7, 8, 9 }).map(x -> x * x).average().ifPresent(System.out::println);
	}

	// @Test
	void testStreamFilterArray() {

		List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");

		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).sorted().forEach(System.out::println);

	}

	// @Test
	void testFileRead() {
		try {
			List<String> bands = Files.lines(Paths.get("/home/charith/bands.txt")).filter(x -> x.contains("jit"))
					.collect(Collectors.toList());
			bands.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	void testFileDataRead() {
		try {
			Stream<String> bands = Files.lines(Paths.get("/home/charith/data.txt"));
			long rows = bands.map(x -> x.split(",")).filter(x -> x.length > 2).count();
			System.out.println("rows :" + rows);
			// bands.forEach(System.out::println);
			bands.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//@Test
	void testFileDataRead2() {
		try {
			Stream<String> bands = Files.lines(Paths.get("/home/charith/data.txt"));
			Map<String, Integer> map = bands.map(x -> x.split(",")).filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));

			//long rows = bands.map(x -> x.split(",")).filter(x -> x.length > 2).count();
			//System.out.println("rows :" + rows);
			
			// bands.forEach(System.out::println);
			bands.close();
			
			/*
			 * for (Map.Entry<String, Integer> set : map.entrySet()) {
			 * 
			 * }
			 */
			
			map.forEach((x,y)-> System.out.println( "key :" + x  +"value :" + y));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	void testReduce() {
		
		IntStream strm = Arrays.stream(new int [] {1,2,3,4,15,3,45,34,45});
		
	 	 OptionalInt result = strm.filter(x-> x>2).reduce((sum, item)-> sum > item ?sum:item );
	 	 System.out.println(result);
		
	}
}
