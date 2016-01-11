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
		System.out.println("|1.문자 설정(Setup the data list)|");
		System.out.println("|2.게임 시작(Start Game)         |");
		System.out.println(" ------------------------------ ");
		System.out.print("메뉴 선택:");
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
			System.out.println("잘못된 값을 입력하셨습니다.");
			break;
		}
		}
		Start_interface();
		return;
	}
	public void Setup_interface()
	{
		System.out.println("들어갈 단어 갯수를 정하세요.");
		data_list_many=input.nextInt();
		input.nextLine();
		for (int i=0;i<data_list_many;i++)
		{
			System.out.println((i+1)+"번째 단어를 입력하세요(Please input the data number"+(i+1)+")");
			Question question = new Question(input.nextLine());
			Questions.add(question);
		}
		System.out.println("설정이 완료되었습니다.");
	}
}
