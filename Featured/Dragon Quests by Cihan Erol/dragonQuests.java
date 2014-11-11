import java.util.Scanner;

/**
 * Author: Cihan Erol
 */
public class dragonQuests {

	public static void printMenu()

	{

		System.out.println("----------------------------------");

		System.out.println("0 - Terminate the game");

		System.out.println("1 - Go North");

		System.out.println("2 - Go East");

		System.out.println("3 - Go West");

		System.out.println("4 - Go South");

		System.out.println("5 - Print the game menu");

		System.out.println("----------------------------------");

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int point = 0;

		boolean isRunning = true;

		int command;

		while (isRunning)

		{

			printMenu();

			double chanceOfEncounter = Math.random();

			System.out.print("Command: ");

			command = input.nextInt();

			switch (command) {

			case 0:

				isRunning = false;

				break;

			case 1:

				System.out.println("You are going North...");

				if (chanceOfEncounter > 0.7)

				{

					System.out.println("You ran into a dragon ...");

					System.out.println("You are killed by the dragon :(");

					System.out.println("Your point is " + point);

					isRunning = false;

				}

				else

				{

					point++;

				}

				break;

			case 2:

				System.out.println("You are going East...");

				if (chanceOfEncounter > 0.5)

				{

					System.out.println("You ran into a dragon ...");

					System.out.println("You are killed by the dragon :(");

					System.out.println("Your point is " + point);

					isRunning = false;

				}

				else

				{

					point++;

				}

				break;

			case 3:

				System.out.println("You are going West...");

				if (chanceOfEncounter > 0.4)

				{

					System.out.println("You ran into a dragon ...");

					System.out.println("You are killed by the dragon :(");

					System.out.println("Your point is " + point);

					isRunning = false;

				}

				else

				{

					point++;

				}

				break;

			case 4:

				System.out.println("You are going South...");

				if (chanceOfEncounter > 0.7)

				{

					System.out.println("You ran into a dragon ...");

					System.out.println("You are killed by the dragon :(");

					System.out.println("Your point is " + point);

					isRunning = false;

				}

				else
				{
					point++;
				}

				break;

			case 5:
				printMenu();
				break;

			default:

				System.out.println("Command not found...");
				break;
			}
		}
	}
}