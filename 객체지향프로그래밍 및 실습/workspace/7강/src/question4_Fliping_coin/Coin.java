package question4_Fliping_coin;

import java.util.StringTokenizer;

public class Coin {
	String Answer = new String();
	private int [] howmany = new int [101];
	public void flip_coin()
	{
		for (int i=0; i<100; i++)
		{
		if (((int)(Math.random()*100))%2==1)
		{
			Answer=Answer+"H";
		}
		else
		{
			Answer=Answer+"T";
		}
		}
		System.out.println(Answer);
		StringTokenizer Number = new StringTokenizer(Answer, "T");
		while (Number.hasMoreTokens())
		{
			howmany[Number.nextToken().length()]++;
		}
	}
	public void print_howmany()
	{
		System.out.println("Length     Number of runs of heads");
		for (int i=1;i<101;i++)
		{
			System.out.println(i+"    "+howmany[i]);
		}
	}
}
