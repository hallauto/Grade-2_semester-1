package question3_PrimeSequence;

public class Tester {
	public static void main(String agrs[])
	{
		PrimeSequence sequence = new PrimeSequence(10);
		for (int i=0;i<10;i++)
		{
			System.out.println(i+"��° �Ҽ�="+sequence.all[i]);
		}
	}
}
