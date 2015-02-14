import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {
	public static void main(String[] args) {
		
		int userChoice;
		int compChoice;
		
		
			Scanner userInput = new Scanner(System.in);
		
			//Users Choice 0,2,3
		
		
			System.out.println("Enter 0=Rock, 1=Paper, 2=Scissors");
			userChoice = userInput.nextInt();
		
		if(userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice. Ending program.");
			// Exit program
			System.exit(0);
		}
		
			//Computers choice
			Random random123 = new Random ();
		
			compChoice = random123.nextInt(3);
		
		if(userChoice == compChoice)
		{
			if(userChoice == 0)
			{
			System.out.println("Both players chose rock!");
			}
			else if (userChoice == 1)
			{
			System.out.println("Both players chose paper!");
			}
			else
			{
			System.out.println("Both players chose scissors!");
			}
			// Exit program
			System.exit(0);
		}
		if(userChoice == 0) // User chooses rock
		{
		if(compChoice == 1)
		{
			System.out.println("You chose rock; Computer chose paper");
			System.out.println("Computer wins!");
		}
		else
		{
			System.out.println("You chose rock; Computer chose scissors");
			System.out.println("You win!");
		}
		}
			else if(userChoice == 1) // User chooses paper
		{
				if(compChoice == 0)
		{
			System.out.println("You chose paper; Computer chose rock");
			System.out.println("You win!");
		}
		else
		{
			System.out.println("You chose paper; Computer chose scissors");
			System.out.println("Computer wins!");
		}
		}
		else	// User chooses scissors
		{
			if(compChoice == 0)
				{
			System.out.println("You chose scissors; Computer chose rock");
			System.out.println("Computer wins!");
		}
		else
		{
			System.out.println("You chose scissors; Computer chose paper");
			System.out.println("You win!");
		}
		}
			
		
		
	}
}
