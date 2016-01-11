package example2_Throtle;
/*
 Throtle 클래스 명세서

개요
Variable
1-private

Methods
1-생성자
2-Accessor Methods
  -1.getGear
3-Modification Methods
  -1.shift
  -2.stop

Variable

1-private
private int Gear
설명:
	기어 단계
선결조건:
	-2<Gear<6
	-1:주차
	 0:중립
	 1~5:주행

Methods

1-생성자
public Throtle(int Gear_input)
인자:
	Gear_input:시작시 기어단계
선결조건:
	-2<Gear_input<6

후결조건:
	Gear의 값이 -1 이상이면 -1로 만든다.(주차 상황)
예외:
	IllegalArgumentException
	Gear가 선결조건에 맞지않으면 오류메시지 출력후 프로그램 종료

2-Accessor Methods
  -1.public int getGear()
반환(return):
	Gear의 값(현재 기어단계)
예외:
	Gear가 범위를 벗어나면 오류메시지 출력

3-Modification Method
  -1.public void shift(int amount)
인자:
	int amount
선결조건:
	amount>0
설명:
	amount만큼 Gear를 움직이는 것을 표현하기위해 amount를 Gear에 더한다.
예외:
	amount를 더해서 나온 Gear값이 범위를 벗어나면 Gear값을 복구하고 오류메시지 출력
  -2.public void stop(int Gear)
인자:
	int Gear
선결조건:
	없음
설명:
	기어를 내리고 정지하는 모습을 표현하기위해 Gear를 -1로 바꾼다.
 */
public class Throttle {
	private int Gear;
	
	public Throttle(int Gear_input)
	{
		Gear=Gear_input;
	}
	public Throttle()
	{
		Gear=0;
	}
	public int getGear()
	{
		return Gear;
	}
	public void shift(int amount)
	{
		int Gear_backup;
		Gear_backup=Gear;
		Gear+=amount;
		if ((Gear<-2)||(Gear>6))
		{
			System.out.println("오류:기어가 범위를 초과해서 조작되었습니다.");
			Gear=Gear_backup;
		}
	}
	public void stop()
	{
		Gear=-1;
	}
}