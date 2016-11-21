package com.xpeppers.workshop.tdd;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzRunnerTest {

	private final int lowerBound;
	private final int upperBound;
	private final String expectedResult;

	private FizzBuzzRunner fizzBuzzRunner;

	public FizzBuzzRunnerTest(int lowerBound, int upperBound, String expectedResult) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
		this.expectedResult = expectedResult;
	}

	@Before
	public void buildRunner() {
		fizzBuzzRunner = new FizzBuzzRunner();
	}

	@Parameters
	public static Collection<Object[]> testCases() {
		// @formatter:off
		return Arrays.asList(new Object[][] { 
			{ 1, 3, "1, 2, Fizz" },
			{ 1, 16, "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16" },
			{ 15, 31, "FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz, 31" },
		});
		// @formatter:on
	}

	@Test
	public void runOnARangeOfNumbers() {
		assertEquals(expectedResult, fizzBuzzRunner.runOn(lowerBound, upperBound));
	}

}
