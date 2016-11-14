package com.xpeppers.workshop.tdd;

public class FizzBuzz {

	public String runOn(int number) {
		if (isMultipleOf(number, 3))
			return "Fizz";

		if (isMultipleOf(number, 5))
			return "Buzz";

		return String.valueOf(number);
	}

	private boolean isMultipleOf(int dividend, int divisor) {
		return dividend % divisor == 0;
	}
}
