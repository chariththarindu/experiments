package com.exp.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.exp.Operation;

class OperationTest {

	@Test
	void test() {
		Operation op = Operation.ADD;
		System.out.println(op.eval(10, 11));
	}

}
