package question7_question3_ArrayList;

public class Tester {
	public static void main(String agrs[])
	{
		IntArray data = new IntArray();
		Duplicate find = new Duplicate(data);
		if (find.search())
		{
			System.out.println("��ġ�� ���� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("��ġ�� ���� �����ϴ�.");
		}
	}

}
