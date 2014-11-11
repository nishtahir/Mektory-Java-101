
/**
 * Better calculator, example
 * Methods, local and global variables
 * returns statements
 * @author Nish
 *
 */
public class BetterCalculator {
	
	//We want this to be available to everyone
	//Global variables
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		num1 = 999999;
		num2 = 556789;
		// We can invoke the method calls right in the print
		// statement
		System.out.println("Add = " + add() + " Sub = " + sub());
	}
	
	// Method to add our 2 numbers and return the result
	public static int add(){
		int result = num1 + num2;
		return result;
	}
	
	// Method to subtract our 2 numbers and return the result
	public static int sub(){
		int result = num1 - num2;
		return result;
	}

}