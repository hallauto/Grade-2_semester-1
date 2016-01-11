package question5_employee;
import java.util.Scanner;
public class Employee {
	private String name,ID,Phone;
	public void get_detaile()
	{
		System.out.println("사원 이름:"+name+" 사원 ID:"+ID+"사원 번호:"+Phone);
	}
	public void change_number()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name=input.nextLine();
		System.out.println("ID를 입력하세요");
		ID=input.nextLine();
		System.out.println("전화번호를 입력하세요");
		Phone=input.nextLine();
	}
	Employee(String name_input,String ID_input,String Phone_input)
	{
		name=name_input;
		ID=ID_input;
		Phone=Phone_input;
	}
}
