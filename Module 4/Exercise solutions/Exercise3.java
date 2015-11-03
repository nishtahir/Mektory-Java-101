import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Here we ask the user how big the list should be
		System.out.print("How big do you want your list? ");

		// Here we get the input for the length
		int length = input.nextInt();

		// We create am empty list
		int[] myList = new int[length];

		System.out.println("Enter -1 to stop inputing");

		int index = 0;
		while (index < myList.length) {
			System.out.print("Enter number for index " + index + ": ");
			int num = input.nextInt();

			// If the number that was entered is -1
			// we stop the loop. break means stop the loop
			if (num == -1) {
				break;
			} else if (num < 1 || num > 10) {
				// If the number is too big or too small we print out
				// a message letting them know
				System.out.println("Number is out of range");
			} else {
				// Here we add the number to the array
				myList[index] = num;

				// Now we move on to the next index
				index++;
			}

			// Notice that our increment is done inside the else block
			// Instead of here, we do this so that we *only* move to the next
			// index when we get valid input.
		}

		// Now we want to figure out which numbers in the list aren't there
		for (int i = 1; i <= myList.length; i++) {
			// This is a flag, we'll check this to know
			// if we found the number
			// We start by assuming that we haven't found it
			boolean isInList = false;

			int count = 0;
			// We'll check every item in the list
			// to see if it's one of the numbers we are looking for
			while (count < myList.length) {

				// If we have a match
				if (myList[count] == i) {
					// set our flag to true
					isInList = true;
				}

				// move to the next item in the list
				count++;
			}

			// If our flag is set to false meaning we haven't found it
			if (isInList == false) {
				// Print out the number
				System.out.println(i);
			}
		}
	}
}
