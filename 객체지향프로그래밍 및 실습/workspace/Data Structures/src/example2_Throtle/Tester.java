package example2_Throtle;

public class Tester {
	public static void main(String agrs[])
	{
		Throttle my = new Throttle(-1);
		Throttle yours = new Throttle();
		my.shift(5);
		System.out.println("my����� ��ġ:"+my.getGear());
		yours.shift(3);
		System.out.println("your����� ��ġ:"+yours.getGear());
		my.stop();
		System.out.println("my����� ��ġ:"+my.getGear());
		yours.stop();
		System.out.println("your����� ��ġ:"+yours.getGear());
	}
}
