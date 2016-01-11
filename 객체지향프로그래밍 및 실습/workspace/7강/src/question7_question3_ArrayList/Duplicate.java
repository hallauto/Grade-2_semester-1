package question7_question3_ArrayList;
import java.util.ArrayList;
public class Duplicate {
	IntArray data;
	boolean answer=false;
	Duplicate(IntArray data_input)
	{
		data=data_input;
	}
	public boolean search()
	{
		Integer find;
		for (int i=0;i<data.get_data_size();i++)
		{
			find=data.get_data_index(i);
			for (int j=i+1;j<data.get_data_size();j++)
			{
				if (find==data.get_data_index(j))
				{
					answer=true;
					return answer;
				}
			}
		}
		return answer;
		
	}
}
