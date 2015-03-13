package com.example;

public class Person {
	String name;
	Car car;

	public String toString() {
		String result = null;
		try {
			result = name + car.color;
		} catch (NullPointerException npe) {
			System.out.println("Caught in Person");
		}
		return result;
	}
}
