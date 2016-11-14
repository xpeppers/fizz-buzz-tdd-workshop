package com.xpeppers.workshop.tdd;

public class FizzBuzz {

	public String runOn(int number) {
		String map = "";

		if (isMultipleOf(number, 3))
			map += "Fizz";

		if (isMultipleOf(number, 5))
			map += "Buzz";

		if (map.isEmpty())
			map = String.valueOf(number);

		return map;
	}

	private boolean isMultipleOf(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

}
