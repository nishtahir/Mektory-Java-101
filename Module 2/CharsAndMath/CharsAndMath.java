public class CharsAndMath {
	public static void main(String[] args) {
		char myCharacter = 'A';
		// Characters can be converted to integers
		int integerValue = myCharacter;
		
		int number = 99;
		// integers can also be converted to characters
		char anotherCharacter = (char) number;
		
		// You can do math with the Math class
		double num = Math.sin(9.9);
		double hyp = Math.hypot(3, 4);

		// It also has a pseudo-random number generator
		double randomNumber = Math.random();
	}
}