package question3_two_floating;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		double number1,number2;
		System.out.println("Enter two floating-point numbers:");
		number1=input.nextDouble();
		number2=input.nextDouble();
		Compare find = new Compare(number1,number2);
		if (find.get_difference())
		{
			System.out.println("They are different when rounded to two decimal places.\nThey differ by less than 0.01.");
		}
		else
		{
			System.out.println("They are the same when rounded to two decimal places.\nThey differ by less than 0.01.");
		}
	}
}
