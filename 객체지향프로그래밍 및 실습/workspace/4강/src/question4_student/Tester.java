package question4_student;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		String name;
		String ID,Phone;
		Scanner input= new Scanner(System.in);
		System.out.println("�̸��� �Է�");
		name=input.nextLine();
		System.out.println("ID �Է�");
		ID=input.nextLine();
		System.out.println("��ȭ��ȣ �Է�");
		Phone=input.nextLine();
		Student first=new Student(name,ID,Phone);
		System.out.println("�л� �̸�:"+first.getname()+" �л� ID:"+first.getID()+" �л� Phone:"+first.getPhone());
	}
}
