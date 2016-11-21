package com.xpeppers.workshop.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzRunnerTest {

	private FizzBuzzRunner fizzBuzzRunner;

	@Before
	public void buildRunner() {
		fizzBuzzRunner = new FizzBuzzRunner();
	}

	@Test
	public void runOnARangeOfThreeNumbers() {
		assertEquals("1, 2, Fizz", fizzBuzzRunner.runOn(1, 3));
	}

	@Test
	public void runOnARangeOfManyNumbers() {
		assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16",
				fizzBuzzRunner.runOn(1, 16));
	}

}
