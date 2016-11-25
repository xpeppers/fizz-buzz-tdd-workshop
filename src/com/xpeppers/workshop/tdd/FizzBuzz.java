package com.xpeppers.workshop.tdd;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FizzBuzz {

	public String runOn(int number) {
		Map<String, Function<Integer, String>> rules = new HashMap<String, Function<Integer, String>>();
		rules.put("fizz-rule", isMultipleOf(3, "Fizz"));
		rules.put("buzz-rule", isMultipleOf(5, "Buzz"));

		String map = "";

		for (String key : rules.keySet()) {
			map += rules.get(key).apply(number);
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
