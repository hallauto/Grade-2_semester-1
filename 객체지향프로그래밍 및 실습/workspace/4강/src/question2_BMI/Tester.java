package question2_BMI;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		double weight=0,height=0,BMI=0;
		Scanner input= new Scanner(System.in);
		System.out.println("������ �Է� (����:kg)");
		weight=input.nextDouble();
		System.out.println("Ű �Է�(����:m)");
		height=input.nextDouble();
		BMI=calculate(weight,height);
		System.out.println("BMI :"+BMI);
	}
	public static double calculate(double weight,double height)
	{
		double BMI=0;
		BMI=weight/(height*height);
		return BMI;
	}
}
