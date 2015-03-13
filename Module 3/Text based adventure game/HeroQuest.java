import java.util.Scanner;

public class HeroQuest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean isRunning = true;
		System.out.println("You are a hero.");
		System.out.println("In a pretty big forest. There are monsters.");
		System.out.println("Try not to die.");

		// Game loop
		while (isRunning == true) {
			System.out.println("What do you want to do?");
			System.out
					.println("1: Go North, 2: Go East, 0: Die and end the game");
			int option = input.nextInt();

			// ctrl + shift + F
			switch (option) {
			
			case 0:
				System.out.println("You ate a bad mushroom and died");
				isRunning = false;
				
			case 1:
				System.out.println("You are heading towards a deep valley.");
				int chanceOfEncounter = (int) (Math.random() * 10);

				if (chanceOfEncounter > 3) {
					int healthOfTree = 9001;
					System.out.println("You ran into an Evil tree.");
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
