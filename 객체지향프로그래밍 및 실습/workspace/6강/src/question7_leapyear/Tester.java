package question7_leapyear;

public class Tester {
	public static void main(String agrs[])
	{
		System.out.println("�� �� �⵵ Ȯ���غ��� �и� ���� �ƴҰ��̿�");
		LeapYear y1 = new LeapYear(1997);
		if (y1.isLeapYear())
		{
			System.out.println("�����̳� �����̿�!");
		}
		else 
		{
			System.out.println("���� ��� �Ժη��ϸ� �ո��� ���ư��°� �𸣳�?");
	
		}
	}
}
