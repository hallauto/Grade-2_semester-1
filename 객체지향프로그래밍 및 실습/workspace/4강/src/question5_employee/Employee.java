package question5_employee;
import java.util.Scanner;
public class Employee {
	private String name,ID,Phone;
	public void get_detaile()
	{
		System.out.println("��� �̸�:"+name+" ��� ID:"+ID+"��� ��ȣ:"+Phone);
	}
	public void change_number()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		name=input.nextLine();
		System.out.println("ID�� �Է��ϼ���");
		ID=input.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
		Phone=input.nextLine();
	}
	Employee(String name_input,String ID_input,String Phone_input)
	{
		name=name_input;
		ID=ID_input;
		Phone=Phone_input;
	}
}
