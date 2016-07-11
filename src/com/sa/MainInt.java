package com.sa;

public class MainInt {

	public Integer sum(Integer one, Integer two) {
		return (one + two);
	}

	public Integer diff(Integer one, Integer two) {
		return (one - two);
	}

	public Integer quotient(Integer one, Integer two) {
		return (one * two);
	}

	public Integer prod(Integer one, Integer two) {
		return (one / two);
	}

	public static void main(String[] args) {

		MainInt main = new MainInt();

		System.out.println("SUM:" + main.sum(1, 2));
		System.out.println("SUM:" + main.diff(1, 2));
		System.out.println("SUM:" + main.quotient(1, 2));
		System.out.println("SUM:" + main.prod(1, 2));
	}

}
