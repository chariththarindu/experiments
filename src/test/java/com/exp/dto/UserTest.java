package com.exp.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class UserTest {

	List<User> userList = null;

	@BeforeAll
	void init() {
		userList = new ArrayList<User>();
		User u1 = User.builder().age(30).name("Charith").postalCode("23").build();
		User u2 = User.builder().age(24).name("Amara").postalCode("24").build();
		User u3 = User.builder().age(25).name("Tharindu").postalCode("34").build();
		User u4 = User.builder().age(25).name("Thameera").postalCode("34").build();

		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);

	}

	// @Test
	void test() {

		List<User> userList2 = userList.stream().sorted(Comparator.comparing(User::getName))
				.collect(Collectors.toList());

		userList2.forEach(System.out::println);
		System.out.println("/////////////////////////////////////////////////////////");
		userList2.stream().filter(x -> x.getName().toLowerCase().startsWith("t")).forEach(System.out::println);

		System.out.println("/////////////////////////////////////////////////////////");
		List<User> userList3 = userList.stream().sorted(Comparator.comparingInt(User::getAge))
				.collect(Collectors.toList());
		userList3.forEach(System.out::println);

		/*
		 * Collections.sort(userList, new Comparator<User> () {
		 * 
		 * @Override public int compare(User u1, User u2) {
		 * 
		 * return u1.getName().compareToIgnoreCase(u1.getName()); }
		 * 
		 * });(u1,u2) -> u1.getName().compareToIgnoreCase(u2.getName())
		 */

		Collections.sort(userList, (x1, x2) -> x1.getName().compareTo(x2.getName()));
		tests(userList, p -> p.getName().startsWith("T"), p -> System.out.println(p));

	}

	//@Test
	void testBiConsumerA() {
		System.out.println("bi Consumer....");
		testBiConsumer(userList, 2, p -> p.getName().startsWith("T"),
				wrapperLamda((x, y) -> System.out.println(x + y)));
	}

	void tests(List<User> personList, Predicate<User> predicate, Consumer<User> consumer) {
		System.out.println("innerrr method start....");
		for (User u : personList) {
			if (predicate.test(u)) {
				consumer.accept(u);
			}
		}

		System.out.println("innerrr method....");
	}

	void testBiConsumer(List<User> personList, int key, Predicate<User> predicate,
			BiConsumer<Integer, Integer> consumer) {
		//System.out.println("innerrr method start....");
		for (User u : personList) {
			if (predicate.test(u)) {
				consumer.accept(u.getAge(), key);

			}
		}

		//System.out.println("innerrr method....");
	}

	BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer) {

		return (x, y) -> {
			System.out.println("wraapper called.....");
			consumer.accept(x, y);};
	}
	
	@Test
	void testSort() {
		
		userList.sort( Comparator.comparing(User::getAge));
		userList.forEach(System.out::println);
	}

	
}
