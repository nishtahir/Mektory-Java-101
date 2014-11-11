/**
 * Example on Arrays
 * @author Nish
 *
 */
public class Arrays {

	public static void main(String[] args) {
		// we can declare an array using '[ ]' 'square brackets'
		int[] ages = { 1, 4, 6, 82, 45, 88, 99 };
		
		// We need a loop counter to control the while loop
		int counter = 0;
		
		System.out.println("------------ while loop -----------");

		// ages.length gives us the length of the array
		while (counter < ages.length) {
			System.out.println(ages[counter]);
			//we increment the counter for the while loop
			counter++;
		}

		System.out.println("------------ for loop -----------");
		// for loops have all the stuff we need to 
		// control the loop in the declaration
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}

		System.out
				.println("------------ Enhanced for loop / For each loop -----------");
		// This is a for each loop, it only works
		// with arrays and Lists
		// for every int variable in age
		for (int age : ages) {
			// we print out age
			System.out.println(age);
		}

		// String array Elements
		String[] names = { "Harry", "Ron", "Hermione", "Dumbledore", "Neville" };
		for (String name : names) {
			System.out.println(name);
		}
	}
}