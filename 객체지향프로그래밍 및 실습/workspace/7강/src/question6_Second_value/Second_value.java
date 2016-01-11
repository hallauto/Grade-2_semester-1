package question6_Second_value;

public class Second_value {
	private int [] inputed;
	private int length;
	Second_value(int [] inputed_input,int length_input)
	{
		length=length_input;
		inputed=new int[length];
		inputed=inputed_input;
		for (int i=0;i<length;i++)
		{
			for (int j=length-1;j>i;j--)
			{
				if (inputed[j-1]<inputed[j])
				{
					int backup = inputed[j-1];
					inputed[j-1]=inputed[j];
					inputed[j]=backup;
				}
			}
		}
	}
	public int get_second_value()
	{
		return inputed[1];
	}
}
