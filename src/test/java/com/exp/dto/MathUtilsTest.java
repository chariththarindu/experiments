package com.exp.dto;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {

	MathUtils math;

	@BeforeAll
	static void globalConfig() {
		System.out.println("Run configs.....");

	}

	@BeforeEach
	void init() {
		math = new MathUtils();
	}

	@AfterEach
	void cleanUp() {
		System.out.println("cleaning up....");
	}

	@Nested
	@DisplayName("Test add method")
	class TestAdd {

		@Test
		@DisplayName("Test add method + ")
		void testAdd() {

			int expected = 2;
			int actual = math.add(1, 1);
			assertEquals(expected, actual, () -> "add expected + " + expected + "but returned" + actual);
		}

		@Test
		@DisplayName("Test add method - ")
		void testAddNegativeNumbers() {
			assertEquals(-2, math.add(-1, -1), "subtract..");
		}
	}

	@Test
	void testCalCircleArea() {

		assertEquals(Math.PI * 100, math.calCircleArea(10), "should return correct circle area");
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> math.divide(2, 0), "divide by zero");
	}

	@Test
	@DisplayName("assert all in one")
	void testAddSet() {
		assertAll(() -> assertEquals(2, math.add(1, 1)), () -> assertEquals(-1, math.add(-2, 1)));
	}

	@Test
	void testSwapVariables() {

		int a = 0;
		int b = 4;

		//a = a + b;
		//b = a - b;
		//a = a - b;
		
		a= a^b;
		b = a^b;
		a= a^b;
		
		System.out.println(" a= " + a + " b= " + b);
		
		

	}

}
