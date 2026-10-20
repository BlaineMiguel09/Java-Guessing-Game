import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
		
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int choice = 1;
		int tries = 0;
		int maxTries = 0;
		boolean guessedCorrectly = false;	
		
		do {
			System.out.println("Welcome to GuessingGame!");
			System.out.println();
			System.out.println("Pick a level from 1-3:\n" + 
					"1 - 10 Tries\n" +
					"2 - 8 tries\n" +
					"3 - 5 tries ");
			int level = input.nextInt();
			
			
			switch (level) {
			case 1: maxTries = 10;
			break;
			case 2: maxTries = 8;
			break;
			case 3: maxTries = 5;
			}
			int secret = random.nextInt(100) + 1;
			tries = 0;
			guessedCorrectly = false;
			
			do {
				
				System.out.print("Input number:");
				int num = input.nextInt();
				tries++;
					
					if (num > secret) {
						System.out.println("Too much");
					}	
					else if (num == secret) {
						guessedCorrectly = true;
					} else {
						System.out.println("Too low");
					}
			} while (tries < maxTries && !guessedCorrectly);
			
				if (guessedCorrectly) {
					System.out.println("You win! " + "attempts: " + tries);
				} else {
					System.out.println("Game over! ");
				}
			
			System.out.println("Do you want to play again?\n" + 
			"1 - continue\n" +
			"2 - to end ");
			choice = input.nextInt();
		}
			while (choice == 1);
		System.out.println("Thank you for playing the game!");

	
	}
}
