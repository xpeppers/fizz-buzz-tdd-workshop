package com.xpeppers.workshop.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void numberNotMultipleOfThreeNorFiveReturnItself() throws Exception {
		assertEquals("1", fizzBuzz.runOn(1));
		assertEquals("7", fizzBuzz.runOn(7));
	}

	@Test
	public void multipleOfThreeReturnsFizz() {
		assertEquals("Fizz", fizzBuzz.runOn(3));
		assertEquals("Fizz", fizzBuzz.runOn(30));
	}

	@Test
	public void multipleOfFiveReturnsFizz() {
		assertEquals("Buzz", fizzBuzz.runOn(5));
		assertEquals("Buzz", fizzBuzz.runOn(25));
	}

}
