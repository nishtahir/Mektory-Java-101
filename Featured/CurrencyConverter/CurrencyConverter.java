import java.util.Scanner;

/**
*	Euro to Turkish Lira currency converter
*
*	Author - Ender Özgün
*/

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Euro TL Currency Changer");
		System.out.println("Please Type Your Euro Amount ");
			Scanner input = new Scanner (System.in);
			double euro = input.nextDouble();
			double Tl= euro * 2.86;
			System.out.println("Your money is " + Tl + " Turkish Liras");	
	}
}
