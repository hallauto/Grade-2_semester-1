package question5_prime;

public class Prime {
	private int limit;
	int min;
	int divide;
	boolean nice=true;
	Prime(int limit_input)
	{
		limit=limit_input;
	}
	public void prime()
	{
		for(min=2;min<limit+1;min++)
		{
			nice=true;
			divide=min;
			while (divide>1)
			{
				if (divide==min)
				{
					--divide;
					continue;
				}
				if ((min%divide)==0)
				{
					nice=false;
					break;
				}
				if (nice==false)
				{
					break;
				}
				--divide;
			}
			if (nice==true)
			{
				System.out.println(min);
			}
		}
	}
}
