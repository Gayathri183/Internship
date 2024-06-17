import java.util.Random;
import java.util.Scanner;

public class PickNumber {
	public static void main(String[] args)
	{
		System.out.println("-------------------------------------------------------");
		System.out.println("		pick a number,any number ....");
		System.out.println("-------------------------------------------------------");
		System.out.println();
		Random rand = new Random();
		int random_number = rand.nextInt(99) + 1;
		
		Scanner mykeyboard = new Scanner(System.in);
		System.out.print("pick a number between 0 and 100(you have 3 guesses):");
		int guess;
		int numberOfTries = 1;
		boolean win = false;
		
		
		while(win == false)
		{
			guess = mykeyboard.nextInt();
			
			if(numberOfTries < 3) {
				
			if(guess==random_number)
			{
				System.out.println();
				System.out.println("you got it! It is indeed: "+random_number);
				System.out.println("It is only took you"+numberOfTries+"guesses to get it right!");
				mykeyboard.close();
				win = true;
			}
			else if(guess < random_number)
			{
				System.out.println("you are too low!");
				System.out.println();
				System.out.println("Guess again: ");
			}
			else if(guess > random_number)
			{
				System.out.println("you are too high!");
				System.out.println();
				System.out.println("Guess again: ");
			}
		}
			else if(numberOfTries == 3)
			{
				if(guess == random_number)
				{
					System.out.println();
					System.out.println("you got it! It is indeed: "+random_number);
					System.out.println("It is only took you"+numberOfTries+"guesses to get it right!");
				}
				if(guess != random_number)
				{
					System.out.println();
					System.out.println("sorry you ran out of attempts. The correct number is "+ random_number +" Better luck for next time!");
					mykeyboard.close();
					break;
					
				}
					
				}
			numberOfTries = numberOfTries + 1;	
			}
	}

}
