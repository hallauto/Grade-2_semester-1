package question1_Two_integer_array;

public class Compare {
	private int[] x_array;
	private int[] y_array;
	Compare(int[] x_array_input, int[] y_array_input)
	{
		x_array = new int[x_array_input.length+1];
		y_array = new int[y_array_input.length+1];
		x_array[0]=x_array_input.length;
		y_array[0]=y_array_input.length;
		for (int i = 1;i<x_array_input.length+1;i++)
		{
			x_array[i]=x_array_input[i-1];
			System.out.println(x_array[i]+"값이 입력되었습니다.");
		}
		for (int i = 1;i<y_array_input.length+1;i++)
		{
			y_array[i]=y_array_input[i-1];
			System.out.println(y_array[i]+"값이 입력되었습니다.");
		}
	}
	public int[] common_array()
	{
		int short_length;
		if (x_array[0]<y_array[0])
		{
			short_length=x_array[0];
		}
		else
		{
			short_length=y_array[0];
		}
		int [] common_array = new int [short_length-1];
		short_length=0;
		for (int i=2;i<x_array.length;i++)
		{
			for (int j=2;j<y_array.length;j++)
			{
				if (x_array[i]==y_array[j])
				{ 
					common_array[short_length]=x_array[i];
					short_length++;
				}
			}
		}
		return common_array;
	}
}