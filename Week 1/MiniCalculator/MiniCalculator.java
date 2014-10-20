import java.util.Scanner;

/*
 * Author - Nish Tahir
 * 
 * Tiny program that calculates stuff
 */

public class MiniCalculator {

	public static void main(String[] args) {

		// This is a scanner, it's used to get input
		// if you get an error, add
		// import java.util.Scanner; to the top of your file
		Scanner input = new Scanner(System.in);

		// This just prints out a message so the user
		// what's going on.
		System.out.println("Type in a length");

		// Here i want to calculate the area of a square
		// i don't want any decimal places so i'm going
		// to store my input in an integer

		int length = input.nextInt();

		// Now i'm going to print out a message
		// along with the solution

		System.out.println("The area of your square is " + length * length);
		
		//This prints out an empty line
		System.out.println("");

		// This just prints out a message so the user
		// what's going on.
		System.out.println("Type in a radius");

		// Here i want to calculate the radius of a circle,
		// so i create a variable to store the radius
		// it could have decimal places so i use a double
		double radius = input.nextDouble();

		// Now i'll create a new variable to store the area
		double area = 3.14 * radius * radius;

		// And i'll now print the result
		System.out.println("The area of your circle is: " + area);
	}
}
