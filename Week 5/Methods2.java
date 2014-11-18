import java.util.Scanner;

/**
 * This program demonstrates methods
 * and parameters
 * It converts lower case characters to
 * all upper case.
 * 
 * @author Nish
 *
 */
public class Methods {

	
	public static void main(String[] args) {
		System.out.println(toUpper("I met Bruce Wayne last winter"));
		
		Scanner input = new Scanner(System.in);
		String mSentence = input.nextLine();
		
		System.out.println(toUpper(mSentence));
		
	}
	//Methods can also take in parameters
	//in this case it's an integer
	public static void myMethod(int mParameter){
		System.out.println("My method prints out something " + mParameter);
	}
	
	// this method takes in a String as a parameter and 
	// returns a string as a result
	public static String toUpper(String sentence){
		String result = sentence.toUpperCase();
		return result;
	}
}
