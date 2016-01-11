package question1_Two_integer_array;

import java.util.Scanner;
public class Array {
	private int [] ex_array;
	private int length;
	Scanner input = new Scanner(System.in);
	Array(int length_input)
	{
		length=length_input;
		ex_array=new int [length+1];
		ex_array[0]=length;
		System.out.println("array 생성합니다.");
		for (int i=1;i<length+1;i++)
		{
			ex_array[i]=input.nextInt();
		}
	}
	public int[] get_array()
	{
		return ex_array;
	}
}