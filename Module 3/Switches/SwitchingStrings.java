import java.util.Scanner;

public class SwitchingStrings {

	/*
	*	Switches are fun and awesome
	*	the 
	*/
	public static void main(String[] args) {
		//Scanner for input. Nothing really new here
		Scanner input = new Scanner(System.in);

		//We prompt the user to type in something
		System.out.print("Type in a name: ");
		String name = input.nextLine();

		//Now we use the switch to match our input
		//Note: You can only switch Strings in
		//Java 7 and above
		switch(name){

		case "Tom": 
			//If the user typed in Tom, then 
			//this case will be executed. 
			System.out.println("We hate Tom");
			//break means stop here and leave the switch
			break;

		case "Jerry":
			//If the user typed in Jerry, then this
			//case will be executed
			System.out.println("Jerry mouse is pretty cool");
			break;
			
		//Default means, if the switch couldn't match
		//any of the other cases, it should do this.
		default:
			System.out.println("Sorry Tom & Jerry only");
			
		}
	}

}
