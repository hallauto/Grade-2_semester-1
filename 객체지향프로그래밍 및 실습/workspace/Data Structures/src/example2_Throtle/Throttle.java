package example2_Throtle;
/*
 Throtle Ŭ���� ����

����
Variable
1-private

Methods
1-������
2-Accessor Methods
  -1.getGear
3-Modification Methods
  -1.shift
  -2.stop

Variable

1-private
private int Gear
����:
	��� �ܰ�
��������:
	-2<Gear<6
	-1:����
	 0:�߸�
	 1~5:����

Methods

1-������
public Throtle(int Gear_input)
����:
	Gear_input:���۽� ���ܰ�
��������:
	-2<Gear_input<6

�İ�����:
	Gear�� ���� -1 �̻��̸� -1�� �����.(���� ��Ȳ)
����:
	IllegalArgumentException
	Gear�� �������ǿ� ���������� �����޽��� ����� ���α׷� ����

2-Accessor Methods
  -1.public int getGear()
��ȯ(return):
	Gear�� ��(���� ���ܰ�)
����:
	Gear�� ������ ����� �����޽��� ���

3-Modification Method
  -1.public void shift(int amount)
����:
	int amount
��������:
	amount>0
����:
	amount��ŭ Gear�� �����̴� ���� ǥ���ϱ����� amount�� Gear�� ���Ѵ�.
����:
	amount�� ���ؼ� ���� Gear���� ������ ����� Gear���� �����ϰ� �����޽��� ���
  -2.public void stop(int Gear)
����:
	int Gear
��������:
	����
����:
	�� ������ �����ϴ� ����� ǥ���ϱ����� Gear�� -1�� �ٲ۴�.
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
			System.out.println("����:�� ������ �ʰ��ؼ� ���۵Ǿ����ϴ�.");
			Gear=Gear_backup;
		}
	}
	public void stop()
	{
		Gear=-1;
	}
}