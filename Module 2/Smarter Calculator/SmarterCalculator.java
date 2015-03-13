import java.util.Scanner;

/**
*	Author: Nish Tahir
*	nishtahir@outlook.com
*/

public class SmarterCalculator {

	// We are basically calculating the length of the
	// hypotenuse of a right angled triangle
	// formula: c^2 = a^2 + b^2 

	public static void main(String[] args) {

		// Keyboard shortcut for auto import
		// Ctrl + shift + o 
		Scanner input = new Scanner(System.in);

		// promt user to type in a value for A
		System.out.print("Type in a value for A: " );

		// get input A
		int a = input.nextInt();
		
		// check if a is 0, because we don't want that
		if (a == 0){
			// print out the reason why we will be stopping the program
			System.out.println(" a can't be 0");
			// Stop the program if a is 0
			System.exit(0);
		}
		
		// get the value of a^2
		double aSquared; 
		aSquared = Math.pow(a, 2);

		/* repeat for b^ */
		
		System.out.print("Type in a value for B: " );
		int b = input.nextInt();
		
		if (b == 0){
			// print out the reason why we will stop the program
			System.out.println(" b can't be 0");
			// Stop the program if a is 0
			System.exit(0);
		}
		double bSquared;
		bSquared = Math.pow(b, 2);
		
		// get the value of c^2 
		double cSquared;
		cSquared = aSquared + bSquared;
		
		// Print out result
		System.out.println("C^2 = " + cSquared);
	}

}
