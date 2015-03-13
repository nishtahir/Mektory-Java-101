public class WhileLoops {
	public static void main(String[] args) {
		// This integer is where we want to start counting from
		int number = 100;
	
		// While loops accept conditional expressions; 
		// expressions that evaluate to either true or false.
		// Example: 2 > 7 is a boolean expression that evaluates to 
		// false. 
		while (number > 0) {
			// While loops will do whatever you put inside the braces until
			// the boolean expression is false.

			// the % sign is the modulus operator 
			// it returns the remainder of a division 
			if(number % 2 == 0){
				System.out.println(number + " - even");
			} else {
				System.out.println(number + " - odd");
			}
			
			// You can control when the while loops ends by
			// simply changing the values passed into the condition
			// we can operate on the values used in the while loop codition

			// We are performing a decrement operation here
			// this can also be written as number--
			number = number - 1;		
		}

		// You can also put boolean literals directly. 
		// The problem with doing this is that you can't change the value
		// once the loop starts
		while(true){
			System.out.println("Infinite loop!");
		}
	}
}
