package example5_DoubleLinkedSeq;

public class Tester {
	public static void main(String agrs[])
	{
		DoubleLinkedSeq Seq1 = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq2 = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq1C = new DoubleLinkedSeq();
		DoubleLinkedSeq Seq1and2 = new DoubleLinkedSeq();
		/*
		 * Sequance가 비어있을때 메소드들의 작동이 어떤지를 확인합니다.
		 */
		System.out.println("비어있는 Seq1의 사이즈"+" "+Seq1.size());
		Seq1.advance();
		Seq1and2=DoubleLinkedSeq.catenation(Seq1,Seq2);
		Seq1.getCurrent();
		Seq1.removeCurrent();
		/*
		 * addAfter메소드와 addBefore메소드 확인
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
		 * clone메소드와 advance메소드 확인
		 */
		Seq1C=(DoubleLinkedSeq)Seq1.clone();
		Seq1.start();	//start메소드 확인
		Seq1.advance();
		System.out.println("Seq1의 2번째 원소:"+Seq1.getCurrent());	//getCurrent메소드 확인
		System.out.println("Seq1의 크기:"+" "+Seq1.size());	//size메소드 확인
		Seq1C.start();
		Seq1C.advance();
		System.out.println("Seq1클론의 2번째 원소:"+Seq1C.getCurrent());
		System.out.println("Seq1클론의 크기:"+" "+Seq1C.size());
		/*
		 * catenation메소드의 작동 확인
		 */
		Seq1and2=DoubleLinkedSeq.catenation(Seq1, Seq2);
		Seq1and2.start();
		for (int i=0;i<Seq1and2.size();i++)
		{
			System.out.println("Seq1and2 "+(i+1)+"번째 원소:"+Seq1and2.getCurrent());
			Seq1and2.advance();
		}
		Seq2.start();
		Seq2.removeCurrent();	//removeCurrent메소드 확인
		for (int i=0;i<Seq2.size();i++)
		{
				System.out.println("Seq2 "+(i+1)+"번째 원소:"+Seq2.getCurrent());
				Seq2.advance();
		}

	}
}
