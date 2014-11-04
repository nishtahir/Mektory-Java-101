import java.util.Scanner;

public class DragonsQuest {

	public static void main(String[] args) {
		// Scanner to accept user input
		// ctrl + shift + o - for auto import
		Scanner input = new Scanner(System.in);
		int command;

		//This boolean is used as a flag to control the while loop
		//setting to false will end the loop
		boolean isRunning = true;
		
		System.out.println("Welcome to dragons quest. You are a lone ranger in");
		System.out.println("an enchanted forest. Mystical creatures rome here freely");
		//main loop - Game loop
		while (isRunning == true) {
			// Here we use print instead of println so that our input will be
			// on the same line as the text
			System.out.print("Command: ");
			// We want to get an integer as a command from the user
			command = input.nextInt();

			// main switch
			// We will use this to progress and 
			switch (command) {
			case 0:
				isRunning = false;
				break;
			case 1:
				System.out.println("You are going north");
				// Here we generate a random number to determine what happens next
				double chanceOfEncounter = Math.random();
				// If our random double is higher than 0.7, Dragon time!! Woo Hoo!
				if(chanceOfEncounter > 0.7){
					System.out.println("You ran into a dragon");
					// Used to keep track of how the player is doing against the dragon
					int dragonsHealth = 100;
					
					// This nested loop ensures that the player must deal with the dragon 
					// before the story can progress
					while(dragonsHealth > 0){
						System.out.print("What do you want to do? ");
						command = input.nextInt();
						
						// Here we have a completely different set of commands to deal
						// with the dragon
						switch(command){
						case 6:
							System.out.println("You bribe the Dragon with icecream...");
							System.out.println("The Dragon is pleased.");
							dragonsHealth = -1;
							break;
						case 7:
							System.out.println("You punch the Dragon in the face");
							dragonsHealth = dragonsHealth - 12; 
							break;
						case 11:
							System.out.println("Dragon's Health: " + dragonsHealth);
							break;
						}
					}
				}
				break;
			case 2:
				System.out.println("You are going east");
				break;
			default:
				System.out.println("Command not found");
				break;
			}
		}
	}

}