package example1_Temperature_Conversion;
/*
 * TemConversion 클래스 명세서

개요
Variables
1-private
2-protect
3-public
  -1.result_CT
  -2.result_FT
  -3.input
Methods
1-생성자
2-Accessor Method
3-Modification Method
  -1.celsiusToFahrenheit
  -2.fahrenheitToCelsius
4-main

Variables
1-private
	없음
2-protect
	없음
3-public
  -1.double result_CT
  설명:
	화씨에서 변환한 섭씨
  -2.double result_FT
  설명:
	섭씨에서 변환한 화씨
  -3.Scanner input
  설명:
	입력 변수
1-생성자
	없음
2-Accessor Method
없음

3-Modification Method
없음
4.main
어떤 온도를 어떤 온도로 바꿀지 결정하도록 설정
 */
import java.util.Scanner;
public class TemConversion {

	public static void main(String[] args) 
	{
		double CT=0;
		double FT=0;
		double result_CT=0;
		double result_FT=0;
		int select=0;
		Scanner input = new Scanner(System.in);
		System.out.println("어떤 작업을 하시겠습니까?");
		System.out.println("1.섭씨를 화씨로 2.화씨를 섭씨로");
		select=input.nextInt();
		if (select==1)
		{
			System.out.println("섭씨 입력");
			CT=input.nextDouble();
			result_FT=CT*1.8+32;
			System.out.println(result_FT + "도");
		}
		if (select==2)
		{
			System.out.println("화씨 입력");
			FT=input.nextDouble();
			result_CT=(FT-32)/1.8;
			System.out.println(result_CT+"도");
		}
	}
}