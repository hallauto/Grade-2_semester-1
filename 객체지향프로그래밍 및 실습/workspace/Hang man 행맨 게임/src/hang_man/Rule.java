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
		System.out.println(Answer.get_ANSWER()+"\n���� ��ȸ:"+'9'+"ȸ");
		for(int i=1;i<11;i++)
		{
			hang_man.print(10-i);
			if (Answer.get_ANSWER().equals(Answer.get_answer()))
			{
				System.out.println("�����մϴ�! ����� ����� �������ϴ�! ����� ��ȣ�� ū ���縦 �����±���!");
				break;
			}
			if (i==10)
			{
				System.out.println("��! ���� ����� ����� �Ҿ����ϴ�! ���������� �� �Ǹ��� ��ȣ�� �ϱ⸦ ���ϴ�.");
				break;
			}
			System.out.println("� ���� �Է��Ͻðڽ��ϱ�?\n1.ö��		2.�ܾ� ��ü");
			select=input.nextInt();
			switch (select)
			{
				case 1:
				{
					System.out.println("ö�ڸ� �Է��ϼ���");
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
					System.out.println(Answer.get_ANSWER()+"\n���� ��ȸ:"+(9-i)+"ȸ");
					for (int j=0;j<inputs.size();j++)
					{
						System.out.print(inputs.get(j)+",");
					}
					System.out.println("");
					break;
				}
				case 2:
				{
					System.out.println("���� �Է��ϼ���");
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
					System.out.println(Answer.get_ANSWER()+"\n���� ��ȸ:"+(9-i)+"ȸ");
					for (int j=0;j<inputs.size();j++)
					{
						System.out.print(inputs.get(j)+",");
					}
					System.out.println("");
					break;
				}
				default:
				{
					System.out.println("�߸��� ���� �Է��߽��ϴ�.");
					continue;
				}
			}
		}
	}
}

