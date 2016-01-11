package question7_leapyear;

public class Tester {
	public static void main(String agrs[])
	{
		System.out.println("야 저 년도 확인해봐라 분명 윤년 아닐것이여");
		LeapYear y1 = new LeapYear(1997);
		if (y1.isLeapYear())
		{
			System.out.println("윤년이네 윤년이여!");
		}
		else 
		{
			System.out.println("연도 계산 함부로하면 손모가지 날아가는거 모르냐?");
	
		}
	}
}
