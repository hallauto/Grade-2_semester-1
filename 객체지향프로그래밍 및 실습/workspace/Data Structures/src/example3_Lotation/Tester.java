package example3_Lotation;
/*
location Ŭ���� ����

1.������
2.Accessor Methods
  -1.getLocate
3.Modification Methods
  -1.move_amount
  -2.move_locate
  -3.restart

1.������
public location (double x,double y)
����:
	double x, double y
	����: double x:�ν��Ͻ��� x ��ǥ�� ��
	      double y:�ν��Ͻ��� y ��ǥ�� ��
	��������:x,y�� �Ǽ�
	�İ�����:����
����:�ν��Ͻ��� ������ x,y��ǥ�� �ʱⰪ�� �����Ѵ�.
����:���� x,y�� �Ǽ� �̿��� ���� ���� �����޽��� ����� ���Է�.
public location ()
����:
	����
����:default�����̴�. �� ��� �ν��Ͻ��� x,y��ǥ�� ���� 0.00 �̴�.

2.Accessor Methods
  -1.public double getLocate()
����:
	����
����:�ν��Ͻ��� x ��ǥ�� �˷��ش�.
��ȯ(return):x
����:���� x,y�� �Ǽ� �̿��� ���� �ֵ��� �����޽��� ����� ����

3.Modification Methods
  -1.public void move_amount(double x_amount,double y_amount)
  ����:
  	double x_amount
	����:
		�ν��Ͻ��� x��ǥ�� ������ �Ÿ�
	double y_amount
	����:
		�ν��Ͻ��� y��ǥ�� ������ �Ÿ�
	��������: x_amount�� y_amount�� �Ǽ�
  ����:
	�Է¹��� �Ÿ���ŭ ��ü�� �̵���Ű�� ����
	�ν��Ͻ��� x�� y�� ���� x_amount,y_amount�� ���Ѵ�.
  -2.public void move_location(double x_locate,double y_locate)
  ����:
	double x_locate
	����:
		�ν��Ͻ��� x��ǥ�� �̵��� ��ġ
	doulbe y_locate
	����:
		�ν��Ͻ��� y��ǥ�� �̵��� ��ġ
	��������:x_locate,y_locate�� �Ǽ�
  ����:
	�Է¹��� ��ġ�� ��ü�� �̵���Ű�� ����
	�ν��Ͻ��� x�� y�� x_locate,y_locate�� ������ �ʱ�ȭ�Ѵ�.
  -3.public void move_spin
  -4.public void restart()
  ����:
	����
  ����:��ü�� ��ġ�� default�� �ǵ�����. default�� ������ default�����ڸ� ��������
	�Ѵ�.
 */
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		double x_amount,y_amount,x_location,y_location;
		Scanner input = new Scanner(System.in);
		Location first = new Location();
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
		System.out.print("x��ǥ ��ȭ �Է�:");
		x_amount=input.nextDouble();
		System.out.print("y��ǥ ��ȭ �Է�:");
		y_amount=input.nextDouble();
		first.move_amount(x_amount, y_amount);
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
		System.out.print("x��ǥ �� �Է�:");
		x_location=input.nextDouble();
		System.out.print("y��ǥ �� �Է�:");
		y_location=input.nextDouble();
		first.move_locate(x_location, y_location);
		System.out.println("x:"+first.getxLocate()+"	y:"+first.getyLocate());
	}
}
