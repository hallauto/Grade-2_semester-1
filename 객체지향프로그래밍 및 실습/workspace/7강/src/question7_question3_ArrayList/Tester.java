package question7_question3_ArrayList;

public class Tester {
	public static void main(String agrs[])
	{
		IntArray data = new IntArray();
		Duplicate find = new Duplicate(data);
		if (find.search())
		{
			System.out.println("겹치는 값이 있습니다.");
		}
		else
		{
			System.out.println("겹치는 값이 없습니다.");
		}
	}

}
