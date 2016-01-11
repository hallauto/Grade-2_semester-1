package question3_Duplicate;

public class Duplicate {
	int [] that;
	int length;
	private boolean answer=false;
	Duplicate(int [] that_input, int length_input)
	{
		length=length_input;
		that=new int[length];
		for (int i=0;i<length;i++)
		{
			that[i]=that_input[i];
		}
	}
	public boolean search()
	{
		int find;
		for (int i=0;i<length;i++)
		{
			find=that[i];
			if (find== -999)
			{
				return answer;
			}
			for(int j=i+1;j<length;j++)
			{
				if (find==that[j])
				{
					answer=true;
				}
			}
		}
		return answer;
	}
}
