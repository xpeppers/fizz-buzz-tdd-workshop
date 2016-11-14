package com.xpeppers.workshop.tdd;

public class FizzBuzz {

	public String runOn(int number) {
		if (isMultipleOfThreee(number))
			return "Fizz";

		return String.valueOf(number);
	}

	private boolean isMultipleOfThreee(int number) {
		return number % 3 == 0;
	}

}
