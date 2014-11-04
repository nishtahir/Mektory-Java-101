public class Loops {
	public static void main(String[] args) {
		// This integer is where we want to start from
		int number = 100;
	
		// The while loop here accepts a conditional expression
		// it resloves to either true or false
		// It will continue to do whatever is in the braces
		// util it evaluates the condition to be false
		while (number > 0) {
			// we can operate on the values used in the while loop codition

			// the % sign is the modulus operator 
			// it returns the remainder of a division 
			if(number % 2 == 0){
				System.out.println(number + " - even");
			} else {
				System.out.println(number + " - odd");
			}
			
			// We are performing a decrement operation here
			// this can also be written as number--
			number = number - 1;		
		}
		
		// i = i + 1 ------ i++
		// i = i - 1 ------ i--
		// This is a for loop
		// it works exactly like a while loop
		// except that all the values used to control the loop
		// can be declared on the same line
		for( int i = 0; i < 100; i--){
			if(i % 2 == 0){
				System.out.println(i + " - even");
			} else {
				System.out.println(i + " - odd");
			}
		}

	}
}
