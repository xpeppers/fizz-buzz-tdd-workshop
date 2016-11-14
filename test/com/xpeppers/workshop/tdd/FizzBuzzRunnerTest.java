package com.xpeppers.workshop.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzRunnerTest {

	@Test
	public void runOnTwoNumbers() {
		assertEquals("1, 2", new FizzBuzzRunner().runOn(1, 2));
	}

}
