import java.util.Scanner;

public class Conditional {

	/* multiline comment
	 * Author - Nish
	 * Update - today 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*  a == b       Checks if a and b are equal
		 * 	a >  b 		 Checks if a is greater than b
		 * 	a <  b       Checks if a is less than b
		 *  a >= b       Greater than or equal 
		 *  a <= b		 Less than or equal
		 *   !=
		 */
		System.out.print("Type in your password: ");
		int password = input.nextInt();
		
		// Sanitizing user input
		// Always check to see if the users' input is valid and something
		// you can use
		if ( password == 0000 ){
			System.out.println("Password Accepted");
		} else {
			System.out.println("Sorry, try again");
		}
	}

}
