package question3_QuadraticEquation;

public class Tester {
	public static void main(String agrs[])
	{
		QuadrasticEquation first = new QuadrasticEquation(1, -5, 4);
		System.out.println("x^2-5x+4ÀÇ ±Ù="+first.getSolution1()+","+first.getSolution2());
	}
}
