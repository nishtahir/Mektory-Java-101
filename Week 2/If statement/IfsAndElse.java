import java.util.Scanner;

/**
 * 
 * @author Nish Tahir
 *
 */

public class IfsAndElse {

	public static void main(String[] args) {

		// if statements are used to compare things
		// you can have as many as you want in your program
		// you compare integers like this
		int x = 77;

		if (x == 77) {
			System.out
					.println("This is done because x is 77... Unless you changed it");
		} else {
			System.out.println("If x is not 77, this get's done.");
		}
		
		/*
		 * You can use lots of operators in your comparisons
		 * 
		 * == equals
		 * != not equals
		 * > greater than
		 * < less than
		 * <= greater than or equals
		 * >= less than or equals
		 * 
		 * Try them out and see how they work!
		 * 
		 */

		// Scanner for input
		Scanner input = new Scanner(System.in);

		// String variable to hold the response from the user
		String response;
		response = input.nextLine();

		// we use response.equals("yes") instead of
		// response == "yes" because
		// == does not work with Strings

		if (response.equals("yes")) {
			// TODO - Launch real ICBM (will be covered in future lesson)
			System.out.println("Congratulations, the moon has been destroyed");
		}
		// optional else if
		else if (response.equals("silence")) {
			// TODO - Actually revive people (will be covered in new course)
			System.out.println("Secret code entered. Reviving MJ");

		} else {
			// This part is executed only if the others don't work
			System.out.println("The moon is safe");
		}

	}
}
