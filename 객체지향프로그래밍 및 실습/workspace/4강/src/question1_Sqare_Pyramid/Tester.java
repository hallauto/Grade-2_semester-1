package question1_Sqare_Pyramid;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Tester {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		calculate_area(Lengthscanner(),HeightScanner());
		
	}
	public static double Lengthscanner()
	{
		double a=0;
		System.out.println("���� ���̸� �Է��ϼ���.");
		a=sc.nextDouble();
		return a;
	}
	public static double HeightScanner()
	{
		double b;
		System.out.println("���̸� �Է��ϼ���.");
		b=sc.nextDouble();
		return b;
	}
	public static void calculate_area(double a,double b)
	{
		double c;
		c=a*b/3;
		System.out.println("���� :" + c);
	}
}
