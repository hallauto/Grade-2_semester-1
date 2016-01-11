package question6_Second_value;
public class Tester {
	public static void main(String agrs[])
	{
		int length=6;
		int []input={0,3,5,4,2,6};
		Second_value in = new Second_value(input,length);
		System.out.println(input+"  "+in.get_second_value());
	}
}
