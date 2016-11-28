package com.xpeppers.workshop.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FizzBuzz {

	public String runOn(int number) {
		List<Function<Integer, String>> rules = new ArrayList<Function<Integer, String>>();
		rules.add(isMultipleOf(3, "Fizz"));
		rules.add(isMultipleOf(5, "Buzz"));

		String map = "";

		for (Function<Integer, String> rule : rules) {
			map += rule.apply(number);
		}

		if (map.isEmpty())
			map = String.valueOf(number);

		return map;
	}

	private Function<Integer, String> isMultipleOf(int divisor, String map) {
		return new Function<Integer, String>() {
			@Override
			public String apply(Integer number) {
				return number % divisor == 0 ? map : "";
			}
		};
	}

}
