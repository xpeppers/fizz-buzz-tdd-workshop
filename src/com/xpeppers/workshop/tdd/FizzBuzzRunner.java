package com.xpeppers.workshop.tdd;

import java.util.StringJoiner;

public class FizzBuzzRunner {

	private FizzBuzz fizzBuzz;

	public FizzBuzzRunner() {
		fizzBuzz = new FizzBuzz();
	}

	public String runOn(int lowerBound, int upperBound) {
		StringJoiner resultCollector = new StringJoiner(", ");
		for (int i = lowerBound; i <= upperBound; i++) {
			resultCollector.add(fizzBuzz.runOn(i));
		}
		return resultCollector.toString();
	}

}
