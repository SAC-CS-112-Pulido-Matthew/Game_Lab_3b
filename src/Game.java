import java.util.Scanner;

public class Game
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int randomNumber;
		int number;
		
		int a,b,c;
		
		randomNumber = (int) (Math.random() * 11 ) + 0;
		
		System.out.print("Enter a guess beteween 0 and 10: ");
		number = input.nextInt();
		
		input.close();
		
		a = (number == randomNumber) ? 1 : 0;
		b = (number > randomNumber) ? 2 : 3;
		c = (number < randomNumber) ? 4 : 5;
		
		if (a == 1)
		{
			System.out.printf("Correct! %d = %d" , randomNumber, number);
		}
		else if (b == 2)
		{
			System.out.printf("Guess is too big! %d < %d" , randomNumber, number);
		}
		else if (c == 4)
		{
			System.out.printf("Guess is too small! %d > %d" , randomNumber, number);
		}
	}
}
