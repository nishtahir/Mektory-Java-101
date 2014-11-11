package com.example;

import java.util.Scanner;

/**
 * 
 * HOW TO USE
 * on ONE line write "any integer" "any + - * / operation" "any integer"
 * you can use spaces between them
 * examples:
 * 12 + 1234
 * 123 / 12
 * 1*2
 * @author Tsotnep
 *
 */

public class EvenBetterCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String ln = new String(scan.nextLine());

		char[] c = ln.toCharArray(); // converting string to char_array

		char TheSymb = '.';

		int n1 = 0, n2 = 0, ans = -1, count = 1, sz = ln.length();

		for (int i = sz - 1; i >= 0; i--) { // we move/read string/char_array
											// from right to left

			if (c[i] >= '0' && c[i] <= '9') {

				count++;

				n1 += calc(c[i], count);

			} else {

				count = 1; // we reset counter, which counts (which)-th symbol
							// is current symbol

				if (c[i] == '+' || c[i] == '-' || c[i] == '*' || c[i] == '/') {

					n2 = n1; // saves first read number (in reality, its second
								// number) into "first number"

					n1 = 0; // resets variable which collects symbols and sums
							// ups to number

					TheSymb = c[i];

				}

			}

		}

		switch (TheSymb) { // actual CALCULATION

		case '+':

			ans = n1 + n2;

			break;

		case '-':

			ans = n1 - n2;

			break;

		case '*':

			ans = n1 * n2;

			break;

		case '/':

			ans = n1 / n2;

			break;

		default:

			System.out.println("I DONT KNOW WHAT THAT SYMBOl IS...");

		}

		System.out.println(ans);

	}

	public static int calc(char symb, int count) {

		/*
		 * 
		 * this method takes SYMBOL (as ASCII character code) and COUNT if COUNT
		 * 
		 * is 2, then this character ("symb") is 2th character from right end
		 * 
		 * for example, if there is a number 51423 in main function, then this
		 * 
		 * function receives following
		 * 
		 * 1) '3' , 1
		 * 
		 * 2) '2' , 2
		 * 
		 * 3) '4' , 3
		 * 
		 * 4) '1' , 4
		 * 
		 * 5) '5' , 5
		 * 
		 * NOTE: first argument is in those things 'X' because it is read as
		 * ASCII CODE, not number
		 * 
		 * so, if we read this number (51423) from main method, this method
		 * 
		 * (calc) will be executed 5 times and it answers/returns will be
		 * 
		 * following
		 * 
		 * 1) 3
		 * 
		 * 2) 20
		 * 
		 * 3) 400
		 * 
		 * 4) 1000
		 * 
		 * 5) 50000
		 * 
		 * because 51423,
		 * 
		 * mathematically is >> 50000 + 1000 + 400 + 20 + 3
		 */

		int ten10 = 1;

		while (--count > 1)

			ten10 = ten10 * 10;

		return (symb - '0') * ten10; // "-'0'" is because its read as ASCII, and
										// to convert it to number

	}
}