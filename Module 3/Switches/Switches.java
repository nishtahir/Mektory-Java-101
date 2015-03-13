import java.util.Scanner;

public class Switches {

	/*
	*	Switches are awesome. They work like if's and elses
	*/
	public static void main(String[] args) {
		//Scanner for input. Nothing really new here
		Scanner input = new Scanner(System.in);

		//We prompt the user to type in something
		System.out.print("Type in a number less than 10: ");
		int value = input.nextInt();

		//You declare a switch by passing in a value with
		//will be matched agains cases
		switch(value){

		case 2: 
			//If the user types in 2, then 
			//this case will be executed. 
			System.out.println("2 is a Prime Number");
			//break means stop here and leave the switch
			break;

		case 3:
			System.out.println("3 is a Prime Number");
			break;
		
		case 5:
			System.out.println("5 is a Prime Number");
			break;
			
		case 7:
			System.out.println("7 is the luckiest Prime Number");
			break;
				
		//Default means, if the switch couldn't match
		//any of the other cases, it should do this.
		default:
			System.out.println("Sorry... No luck...");
			
		}
	}
}
