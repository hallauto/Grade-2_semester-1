package thread;

public class Print implements Runnable{
	String hello;
	int number;
	Print()
	{
		number=1;
		hello = new String("�λ縸 "+number+"��°!");
	}
	public void run()
	{
		while(true)
		{
			System.out.println(hello);
			increase();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void increase()
	{
		hello = new String("�λ� ��"+(++number)+"��°!");
	}
}
