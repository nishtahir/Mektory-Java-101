import java.util.Scanner;

public class HeroQuest {
	public static void main(String[] args) {
		//Scanner to get glorious user input
		Scanner input = new Scanner(System.in);

		//A helpful boolean variable to manage my game loop
		boolean isRunning = true;

		//A short prompt to set the scene
		System.out.println("You are a hero.");
		System.out.println("In a pretty big forest. There are monsters.");
		System.out.println("Try not to die.");

		// Game loop - can't have a game without it
		// the point of this is to keep the program alive until the user 
		// decides to end it or gets to game over.
		while (isRunning == true) {
			System.out.println("What do you want to do?");
			System.out
					.println("1: Go North, 2: Go East, 0: Die and end the game");
			//Get input from the user; he/she has no idea what's coming
			int option = input.nextInt();

			switch (option) {
			
			case 0:
				System.out.println("You ate a bad mushroom and died");

				//Setting this to false will cause the loop to end 
				isRunning = false;
				
			case 1:
				System.out.println("You are heading towards a deep valley.");

				//We want to add a bit of randomness to our game.
				//This makes it more predictable and more fun to play
				int chanceOfEncounter = (int) (Math.random() * 10);

				if (chanceOfEncounter > 3) {

					int healthOfTree = 9001;
					System.out.println("You ran into an Evil tree.");

					//Here we start a second while loop (nested loop)
					//This forces the player to play our our encounter scenario before
					//the player can move on with the game
					while(healthOfTree >= 0){
						System.out.println("How will you deal with the tree? ");
						System.out.print("1: Sing to it, 2: Punch it in the face, 3: Try to run - ");
						int choice = input.nextInt();
						
						switch(choice){
						case 1:
							System.out.println("The tree is mildy entertained... It allows you to pass.");
							healthOfTree = -1;
							break;
						case 2:
							break;
						case 3:
							break;
						}
					}
				}
				break;
			case 2:
				System.out.println("You are heading east towards the ocean.");
				break;
			}
		}
	
		System.out.println("Game over... better luck next time");
	}
}
