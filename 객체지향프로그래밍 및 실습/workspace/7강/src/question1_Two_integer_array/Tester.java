package question1_Two_integer_array;

public class Tester {
	public static void main(String agsr[])
	{
		Array first_array = new Array(6);
		Array second_array = new Array(7);
		Compare comp = new Compare(first_array.get_array(),second_array.get_array());
		for (int i = 0;i<comp.common_array().length;i++)
		{
			System.out.print(comp.common_array()[i]+" ");
		}
	}
}
