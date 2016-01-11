package question3_car_simulation;
import java.util.Scanner;
public class Tester {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("초기 연료량 입력 (단위:l)");
		Car myCar = new Car(input.nextDouble());
		System.out.println("이동거리 입력 (단위:km)");
		myCar.drive(input.nextDouble());
		System.out.println("남은 연료량:"+myCar.getGasInTank()+"리터");
	}
}
