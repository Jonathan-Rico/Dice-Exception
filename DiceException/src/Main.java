import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {	
	public static void main(String args []) {		
	
		Dice dice = new Dice();
		
		Scanner input = new Scanner (System.in);
		int dices;
		boolean continueLoop = true;
		
		do {
			try {
				System.out.printf("Type in the number of dice you want to be rolled. From 1-3 dice.\n");
				dices = input.nextInt();			
				
				int D = dice.Throw(dices);
				int avg = D/dices;
				System.out.printf("The dice rolls have an average value of %d", avg);	
				continueLoop = false;
			}
			catch (ArithmeticException arithmeticException) {
				System.err.printf("Exception: Number is less than 1 or greater than 3.\n", arithmeticException);
				input.nextLine();
				System.out.printf("You must use a number between 1 and 3.\n");
			}
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("Exception: User input is not a number\n", inputMismatchException);
				input.nextLine();
				System.out.printf("You must use an integer number between 1 and 3.\n");
			}
		} while ( continueLoop );
	}
}