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
		System.out.println("변의 길이를 입력하세요.");
		a=sc.nextDouble();
		return a;
	}
	public static double HeightScanner()
	{
		double b;
		System.out.println("높이를 입력하세요.");
		b=sc.nextDouble();
		return b;
	}
	public static void calculate_area(double a,double b)
	{
		double c;
		c=a*b/3;
		System.out.println("면적 :" + c);
	}
}
