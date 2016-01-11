package hang_man;

import java.util.ArrayList;
import java.util.Scanner;
public class Rule {
	private Question Answer;
	Scanner input = new Scanner(System.in);
	ArrayList<String> inputs = new ArrayList<String>();
	Rule (Question Answer_input)
	{
		Answer=Answer_input;
	}
	public void play_1()
	{
		int select;
		Hang_man hang_man= new Hang_man();
		System.out.println(Answer.get_ANSWER()+"\n남은 기회:"+'9'+"회");
		for(int i=1;i<11;i++)
		{
			hang_man.print(10-i);
			if (Answer.get_ANSWER().equals(Answer.get_answer()))
			{
				System.out.println("축하합니다! 행맨은 목숨을 건졌습니다! 당신의 변호에 큰 감사를 보내는군요!");
				break;
			}
			if (i==10)
			{
				System.out.println("아! 끝내 행맨은 목숨을 잃었습니다! 다음번에는 더 훌륭한 변호를 하기를 빕니다.");
				break;
			}
			System.out.println("어떤 답을 입력하시겠습니까?\n1.철자		2.단어 전체");
			select=input.nextInt();
			switch (select)
			{
				case 1:
				{
					System.out.println("철자를 입력하세요");
					input.nextLine();
					if (inputs.isEmpty())
					{
						inputs.add(0, input.nextLine());
					}
					else
					{
						inputs.add(input.nextLine());
					}
					Answer.insult_answer(inputs.get(i-1).charAt(0));
					System.out.println(Answer.get_ANSWER()+"\n남은 기회:"+(9-i)+"회");
					for (int j=0;j<inputs.size();j++)
					{
						System.out.print(inputs.get(j)+",");
					}
					System.out.println("");
					break;
				}
				case 2:
				{
					System.out.println("답을 입력하세요");
					input.nextLine();
					if (inputs.isEmpty())
					{
						inputs.set(0, input.nextLine());
					}
					else
					{
						inputs.add(input.nextLine());
					}
					Answer.insult_answer(inputs.get(i-1));
					System.out.println(Answer.get_ANSWER()+"\n남은 기회:"+(9-i)+"회");
					for (int j=0;j<inputs.size();j++)
					{
						System.out.print(inputs.get(j)+",");
					}
					System.out.println("");
					break;
				}
				default:
				{
					System.out.println("잘못된 값을 입력했습니다.");
					continue;
				}
			}
		}
	}
}

