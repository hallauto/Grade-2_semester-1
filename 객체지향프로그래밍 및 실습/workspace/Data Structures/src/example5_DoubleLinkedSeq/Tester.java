package example5_DoubleLinkedSeq;

public class Tester {
	public static void main(String agrs[])
	{
		DoubleLinkedSeq Seq1 = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq2 = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq1C = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq1and2 = new DoubleLinkedSeq();
		/*
		 * Sequance�� ��������� �޼ҵ���� �۵��� ����� Ȯ���մϴ�.
		 */
		System.out.println("����ִ� Seq1�� ������"+" "+Seq1.size());
		Seq1.advance();
		Seq1and2=DoubleLinkedSeq.catenation(Seq1,Seq2);
		Seq1.getCurrent();
		Seq1.removeCurrent();
		/*
		 * addAfter�޼ҵ�� addBefore�޼ҵ� Ȯ��
		 */
		for(int i=0;i<3;i++)
		{
			Seq1.addAfter((double)i);
		}
		for (int i=10;i<13;i++)
		{
			Seq2.addAfter((double)i);
		}
		
		Seq1.addBefore(5.0);
		Seq2.addAfter(4.0);
		/*
		 * clone�޼ҵ�� advance�޼ҵ� Ȯ��
		 */
		Seq1C=(DoubleLinkedSeq)Seq1.clone();
		Seq1.start();	//start�޼ҵ� Ȯ��
		Seq1.advance();
		System.out.println("Seq1�� 2��° ����:"+Seq1.getCurrent());	//getCurrent�޼ҵ� Ȯ��
		System.out.println("Seq1�� ũ��:"+" "+Seq1.size());	//size�޼ҵ� Ȯ��
		Seq1C.start();
		Seq1C.advance();
		System.out.println("Seq1Ŭ���� 2��° ����:"+Seq1C.getCurrent());
		System.out.println("Seq1Ŭ���� ũ��:"+" "+Seq1C.size());
		/*
		 * catenation�޼ҵ��� �۵� Ȯ��
		 */
		Seq1and2=DoubleLinkedSeq.catenation(Seq1, Seq2);
		Seq1and2.start();
		for (int i=0;i<Seq1and2.size();i++)
		{
			System.out.println("Seq1and2 "+(i+1)+"��° ����:"+Seq1and2.getCurrent());
			Seq1and2.advance();
		}
		Seq2.start();
		Seq2.removeCurrent();	//removeCurrent�޼ҵ� Ȯ��
		for (int i=0;i<Seq2.size();i++)
		{
				System.out.println("Seq2 "+(i+1)+"��° ����:"+Seq2.getCurrent());
				Seq2.advance();
		}

	}
}
