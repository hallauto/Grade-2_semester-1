package example3_Lotation;
/*
location 클래스 명세서

1.생성자
2.Accessor Methods
  -1.getLocate
3.Modification Methods
  -1.move_amount
  -2.move_locate
  -3.restart

1.생성자
public location (double x,double y)
인자:
	double x, double y
	설명: double x:인스턴스의 x 좌표의 값
	      double y:인스턴스의 y 좌표의 값
	선결조건:x,y는 실수
	후결조건:없음
설명:인스턴스의 생성시 x,y좌표의 초기값을 지정한다.
예외:인자 x,y에 실수 이외의 값이 들어가면 오류메시지 출력후 재입력.
public location ()
인자:
	없음
설명:default생성이다. 이 경우 인스턴스의 x,y좌표의 값은 0.00 이다.

2.Accessor Methods
  -1.public double getLocate()
인자:
	없음
설명:인스턴스의 x 좌표를 알려준다.
반환(return):x
예외:인자 x,y에 실수 이외의 값이 있따면 오류메시지 출력후 종료

3.Modification Methods
  -1.public void move_amount(double x_amount,double y_amount)
  인자:
  	double x_amount
	설명:
		인스턴스의 x좌표를 움직일 거리
	double y_amount
	설명:
		인스턴스의 y좌표를 움직일 거리
	선결조건: x_amount와 y_amount는 실수
  설명:
	입력받은 거리만큼 객체를 이동시키기 위해
	인스턴스의 x와 y에 각각 x_amount,y_amount를 더한다.
  -2.public void move_location(double x_locate,double y_locate)
  인자:
	double x_locate
	설명:
		인스턴스의 x좌표의 이동할 위치
	doulbe y_locate
	설명:
		인스턴스의 y좌표의 이동할 위치
	선결조건:x_locate,y_locate는 실수
  설명:
	입력받은 위치로 객체를 이동시키기 위해
	인스턴스의 x와 y를 x_locate,y_locate의 값으로 초기화한다.
  -3.public void move_spin
  -4.public void restart()
  인자:
	없음
  설명:객체의 위치를 default로 되돌린다. default의 기준은 default생성자를 기준으로
	한다.
 */
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		double x_amount,y_amount,x_location,y_location;
		Scanner input = new Scanner(System.in);
		Location first = new Location();
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
		System.out.print("x좌표 변화 입력:");
		x_amount=input.nextDouble();
		System.out.print("y좌표 변화 입력:");
		y_amount=input.nextDouble();
		first.move_amount(x_amount, y_amount);
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
		System.out.print("x좌표 재 입력:");
		x_location=input.nextDouble();
		System.out.print("y좌표 재 입력:");
		y_location=input.nextDouble();
		first.move_locate(x_location, y_location);
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
	}
}
