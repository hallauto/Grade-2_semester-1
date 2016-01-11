package question3_PrimeSequence;

import interface_Lecture10.Sequence;

public class PrimeSequence implements Sequence{
	int end_number,manyitem=0;
	int [] all;
	PrimeSequence(int end_number)
	{
		this.end_number=end_number;
		all = new int [end_number];
		for (int i=0;i<end_number;i++)
		{
			all[i]=next();
			manyitem=i+1;
		}
	}
	public int next()
	{
		if (manyitem==0)
		{
			return 2;
		}
		for (int i=all[manyitem-1]+1;true;i++)
		{
			for (int j=2;j<i;j++)
			{
				if (i%j==0)
				{
					break;
				}
				else
				{
					return i;
				}
			}
		}
	}
}
