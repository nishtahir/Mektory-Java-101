import java.util.Scanner;


public class AreaOfTriangle {

	public static void main(String[] args) {
		// The formula for the area of a triangle is
		// base * height / 2
		
		// Scanner for input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type in a base: ");
		double base = input.nextDouble();
		
		System.out.print("Type in a height: ");
		double height = input.nextDouble();
		
		// Now we need to check the user input to see if
		// it's usable
		
		/* How && (And) works
		 *  
		 * T && T = T
		 * T && F = F
		 * F && T = F
		 * F && F = F
		 * 
		 * How || (Or) works
		 * 
		 * T || T = T
		 * T || F = T
		 * F || T = T
		 * F || F = F
		 */
		if(base > 0 && height > 0){
			// If both values are larger than 0, 
			// Print out the answer
			System.out.println("The area of the triangle is: " + (base * height / 2));
		}		
	}
}