package question7_question3_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class IntArray {
	private ArrayList<Integer> data = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	IntArray()
	{
		System.out.println("ArrayList »ı¼º");
		for (;true;)
		{
			data.add(input.nextInt());
			if (data.get(data.size()-1)==-999)
			{
				break;
			}
		}
	}
	public ArrayList<Integer> get_data()
	{
		return data;
	}
	public Integer get_data_index(int index)
	{
		return data.get(index);
	}
	public int get_data_size()
	{
		return data.size();
	}
}
