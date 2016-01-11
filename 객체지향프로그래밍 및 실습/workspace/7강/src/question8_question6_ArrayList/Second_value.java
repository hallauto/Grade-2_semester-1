package question8_question6_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Second_value {
	private ArrayList<Integer> target = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	Second_value()
	{
		System.out.println("ArrayList »ý¼º");
		for (;true;)
		{
			target.add(input.nextInt());
			if (target.get(target.size()-1)==-999)
			{
				for (int i=0;i<target.size();i++)
				{
					Integer backup1 = 0;
					Integer backup2 = 0;
					if (target.get(target.size()-1)<target.get(i))
					{
						backup1=target.get(i);
						target.set(i,target.size()-1);
						for (int j=i+1;j<target.size();j++)
						{
							backup2=target.get(j);
							target.set(j,backup1);
							backup1=backup2;
							
						}
					}
				}
				break;
			}
			for (int i=0;i<target.size();i++)
			{
				Integer backup1 = 0;
				Integer backup2 = 0;
				if (target.get(target.size()-1)<target.get(i))
				{
					backup1=target.get(i);
					target.set(i,target.size()-1);
					for (int j=i+1;j<target.size();j++)
					{
						backup2=target.get(j);
						target.set(j,backup1);
						backup1=backup2;
						
					}
				}
			}
		}
		
	}
	public Integer get_second()
	{
		return target.get(target.size()-2);
	}
}
