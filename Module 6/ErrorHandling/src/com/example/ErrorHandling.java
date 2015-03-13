package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*	You can find a list of exceptions in the 
*	Java documentation 
*/
public class ErrorHandling {
	public static void main(String[] args) {
		// We put potentially dangerous methods inside of the 
		// try catch block so we can prepare and handle
		// any errors in the program
		try {
			sampleMethod(2);
		} catch (Exception e) {
			System.out.println("Something went wrong. That's all i know...");
		}
		
	}
	// 1 ok, 2 exception, 3 ok, 4 exception
	public static void sampleMethod(int number) throws Exception{
		if(number % 2 == 0){
			// When you want to generate your own Error,
			// you throw a new Exception
			throw new Exception();
		} else {
			System.out.println("OK");
		}
	}

}
