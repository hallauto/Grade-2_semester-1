package hang_man;

import java.util.ArrayList;
import java.util.Scanner;
public class Start_and_Setup {
	int select;
	int data_list_many;
	ArrayList<Question> Questions;
	Scanner input = new Scanner(System.in);
	public Start_and_Setup(ArrayList<Question> Questions_input)
	{
		Questions=Questions_input;
	}
	public void Start_interface()
	{
		System.out.println("*******************************");
		System.out.println("*  OOP_HOMEWORK      HANGMAN  *");
		System.out.println("*******************************\n");
		System.out.println(" ------------------------------ ");
		System.out.println("|1.���� ����(Setup the data list)|");
		System.out.println("|2.���� ����(Start Game)         |");
		System.out.println(" ------------------------------ ");
		System.out.print("�޴� ����:");
		select=input.nextInt();
		switch (select)
		{
		case 1:
		{
			Setup_interface();
			break;
		}
		case 2:
		{
			Rule play = new Rule(Questions.get(((int)(Math.random()*100))%data_list_many));
			play.play_1();
			return;
		}
		default :
		{
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			break;
		}
		}
		Start_interface();
		return;
	}
	public void Setup_interface()
	{
		System.out.println("�� �ܾ� ������ ���ϼ���.");
		data_list_many=input.nextInt();
		input.nextLine();
		for (int i=0;i<data_list_many;i++)
		{
			System.out.println((i+1)+"��° �ܾ �Է��ϼ���(Please input the data number"+(i+1)+")");
			Question question = new Question(input.nextLine());
			Questions.add(question);
		}
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}
}
