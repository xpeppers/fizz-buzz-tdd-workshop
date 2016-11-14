package com.xpeppers.workshop.tdd;

public class FizzBuzzRunner {

	private FizzBuzz fizzBuzz;

	public FizzBuzzRunner() {
		fizzBuzz = new FizzBuzz();
	}

	public String runOn(int first, int second) {
		return fizzBuzz.runOn(first) + ", " + fizzBuzz.runOn(second);
	}

}
