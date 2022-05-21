import java.util.Scanner;

/**
* A program that converts number to word.
*
* @author  Vincent Zhang
* @version 1.0
* @since   2018-06-24
*
* Time Spent: 3 minutes
*/

public class PrintNumberInWordIf
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if(number == 1)
			System.out.println("ONE");
		else if(number == 2)
			System.out.println("TWO");
		else if(number == 3)
			System.out.println("THREE");
		else if(number == 4)
			System.out.println("FOUR");
		else if(number == 5)
			System.out.println("FIVE");
		else if(number == 6)
			System.out.println("SIX");
		else if(number == 7)
			System.out.println("SEVEN");
		else if(number == 8)
			System.out.println("EIGHT");
		else if(number == 9)
			System.out.println("NINE");
		else
			System.out.println("OTHER");
	}
}