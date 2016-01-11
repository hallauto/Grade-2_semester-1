package question4_student;
import java.util.Scanner;
public class Tester {
	public static void main(String agrs[])
	{
		String name;
		String ID,Phone;
		Scanner input= new Scanner(System.in);
		System.out.println("이름을 입력");
		name=input.nextLine();
		System.out.println("ID 입력");
		ID=input.nextLine();
		System.out.println("전화번호 입력");
		Phone=input.nextLine();
		Student first=new Student(name,ID,Phone);
		System.out.println("학생 이름:"+first.getname()+" 학생 ID:"+first.getID()+" 학생 Phone:"+first.getPhone());
	}
}
