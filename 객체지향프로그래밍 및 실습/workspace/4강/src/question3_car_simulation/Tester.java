package question3_car_simulation;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("�ʱ� ���ᷮ �Է� (����:l)");
		Car myCar = new Car(input.nextDouble());
		System.out.println("�̵��Ÿ� �Է� (����:km)");
		myCar.drive(input.nextDouble());
		System.out.println("���� ���ᷮ:"+myCar.getGasInTank()+"����");
	}
}
