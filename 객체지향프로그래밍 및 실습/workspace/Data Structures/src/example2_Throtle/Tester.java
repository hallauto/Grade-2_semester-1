package example2_Throtle;

public class Tester {
	public static void main(String agrs[])
	{
		Throttle my = new Throttle(-1);
		Throttle yours = new Throttle();
		my.shift(5);
		System.out.println("my기어의 위치:"+my.getGear());
		yours.shift(3);
		System.out.println("your기어의 위치:"+yours.getGear());
		my.stop();
		System.out.println("my기어의 위치:"+my.getGear());
		yours.stop();
		System.out.println("your기어의 위치:"+yours.getGear());
	}
}
