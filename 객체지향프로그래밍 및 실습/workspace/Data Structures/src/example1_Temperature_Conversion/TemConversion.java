package example1_Temperature_Conversion;
/*
 * TemConversion Ŭ���� ����

����
Variables
1-private
2-protect
3-public
  -1.result_CT
  -2.result_FT
  -3.input
Methods
1-������
2-Accessor Method
3-Modification Method
  -1.celsiusToFahrenheit
  -2.fahrenheitToCelsius
4-main

Variables
1-private
	����
2-protect
	����
3-public
  -1.double result_CT
  ����:
	ȭ������ ��ȯ�� ����
  -2.double result_FT
  ����:
	�������� ��ȯ�� ȭ��
  -3.Scanner input
  ����:
	�Է� ����
1-������
	����
2-Accessor Method
����

3-Modification Method
����
4.main
� �µ��� � �µ��� �ٲ��� �����ϵ��� ����
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
		System.out.println("� �۾��� �Ͻðڽ��ϱ�?");
		System.out.println("1.������ ȭ���� 2.ȭ���� ������");
		select=input.nextInt();
		if (select==1)
		{
			System.out.println("���� �Է�");
			CT=input.nextDouble();
			result_FT=CT*1.8+32;
			System.out.println(result_FT + "��");
		}
		if (select==2)
		{
			System.out.println("ȭ�� �Է�");
			FT=input.nextDouble();
			result_CT=(FT-32)/1.8;
			System.out.println(result_CT+"��");
		}
	}
}