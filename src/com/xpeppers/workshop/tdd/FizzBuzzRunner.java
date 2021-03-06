package com.xpeppers.workshop.tdd;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzRunner {

	private FizzBuzz fizzBuzz;

	public FizzBuzzRunner() {
		fizzBuzz = new FizzBuzz();
	}

	public String runOn(int lowerBound, int upperBound) {
		return IntStream.rangeClosed(lowerBound, upperBound)
				.mapToObj(i -> fizzBuzz.runOn(i))
				.collect(Collectors.joining(", "));
	}

}
