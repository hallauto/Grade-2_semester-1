package question3_QuadraticEquation;

public class QuadrasticEquation {
	private double a,b,c;
	public QuadrasticEquation(double input_a,double input_b,double input_c)
	{
		/*
		 * 생성자
		 * default 생성자 없음
		 * 인자:double input_a,double input_b,input_c
		 */
		a=input_a;
		b=input_b;
		c=input_c;
	}
	public double getSolution1()
	{
		return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	}
	public double getSolution2()
	{
		return (-b-Math.sqrt(b*b-4*a*c))/(2*a);
	}
}
