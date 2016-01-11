package example5_DoubleLinkedSeq;

public class DoubleLinkedSeq implements Cloneable {
	private double data;
	private DoubleLinkedSeq next,cursor,pre_cursor;

	   
	   /**
	   * Initialize an empty sequence.
	   * @param - none
	   * <dt><b>Postcondition:</b><dd>
	   *   This sequence is empty.
	   **/   
	DoubleLinkedSeq()
	{
		data=0;
		next=null;
		cursor=null;
		pre_cursor=null;
	}
	DoubleLinkedSeq(double data_input)
	{
		data=data_input;
		next=null;
		cursor=null;
		pre_cursor=null;
	}
	   /**
	   * Add a new element to this sequence, after the current element. 
	   * @param element</CODE>
	   *   the new element that is being added
	   * <dt><b>Postcondition:</b><dd>
	   *   A new copy of the element has been added to this sequence. If there was
	   *   a current element, then the new element is placed after the current
	   *   element. If there was no current element, then the new element is placed
	   *   at the end of the sequence. In all cases, the new element becomes the
	   *   new current element of this sequence. 
	   * @exception OutOfMemoryError
	   *   Indicates insufficient memory for a new node.
	   **/
	public void addAfter(double element)
	{
		DoubleLinkedSeq insult = new DoubleLinkedSeq(element);
		if(cursor==null) //���Ұ� �ϳ��� ���� ���
		{
			next=insult;
			cursor=insult;
			return;
		}
		if(cursor.next==null) //���Ұ� �ϳ��� �ִ� ��� or cursor�� ���� �ִ°��
		{
			pre_cursor=cursor;
			cursor.next=insult;
			cursor=insult;
			return;
		}
		pre_cursor=cursor;
		insult.next=cursor.next;
		cursor.next=insult;
		cursor=insult;
	}
	   /**
	   * Add a new element to this sequence, before the current element. 
	   * @param element</CODE>
	   *   the new element that is being added
	   * <dt><b>Postcondition:</b><dd>
	   *   A new copy of the element has been added to this sequence. If there was
	   *   a current element, then the new element is placed before the current
	   *   element. If there was no current element, then the new element is placed
	   *   at the start of the sequence. In all cases, the new element becomes the
	   *   new current element of this sequence. 
	   * @exception OutOfMemoryError
	   *   Indicates insufficient memory for a new node.
	   **/

	public void addBefore(double element)
	{
		DoubleLinkedSeq insult = new DoubleLinkedSeq(element);
		if(pre_cursor==null)
		{
			if (cursor==null) //���Ұ� ���� ���
			{
				next=insult;
				cursor=insult;
				return;
			}
			else //���Ұ� �ϳ��� �ִ°��
			{
				next=insult;
				pre_cursor=insult;
				insult.next=cursor;
				return;
			}
		}
		insult.next=pre_cursor.next;
		pre_cursor.next=insult;
		pre_cursor=insult;
	}
	   /**
	   * Place the contents of another sequence at the end of this sequence.
	   * @param addend</CODE>
	   *   a sequence whose contents will be placed at the end of this sequence
	   * <dt><b>Precondition:</b><dd>
	   *   The parameter, addend</CODE>, is not null. 
	   * <dt><b>Postcondition:</b><dd>
	   *   The elements from addend</CODE> have been placed at the end of 
	   *   this sequence. The current element of this sequence remains where it 
	   *   was, and the addend</CODE> is also unchanged.
	   * @exception NullPointerException
	   *   Indicates that addend</CODE> is null. 
	   * @exception OutOfMemoryError
	   *   Indicates insufficient memory to increase the size of this sequence.
	   **/

	public void addAll(DoubleLinkedSeq addend)
	{
		if(addend==null)
		{
			System.out.println("addend�� null�Դϴ�.");
			return;
		}
		for (;cursor.next!=null;cursor=cursor.next)
		{
		}
		pre_cursor=cursor;
		cursor.next=addend.next;
		cursor=cursor.next;
		
	}

	   /**
	   * Move forward, so that the current element is now the next element in
	   * this sequence.
	   * @param - none
	   * <dt><b>Precondition:</b><dd>
	   *   isCurrent()</CODE> returns true. 
	   * <dt><b>Postcondition:</b><dd>
	   *   If the current element was already the end element of this sequence 
	   *   (with nothing after it), then there is no longer any current element. 
	   *   Otherwise, the new element is the element immediately after the 
	   *   original current element.
	   * @exception IllegalStateException
	   *   Indicates that there is no current element, so 
	   *   advance</CODE> may not be called.
	   **/
	public void advance()
	{

		if(isCurrent())
		{
			if(cursor.next!=null)
			{
				cursor=cursor.next;
			}
			else
			{
				System.out.println("���� ���� �ֽ��ϴ�.");
			}
		}
		else
		{
			System.out.println("���� Sequance�� �ƹ��͵� �����ϴ�.");
		}
	}
	   /**
	   * Generate a copy of this sequence.
	   * @param - none
	   * @return
	   *   The return value is a copy of this sequence. Subsequent changes to the
	   *   copy will not affect the original, nor vice versa. Note that the return
	   *   value must be type cast to a DoubleLinkedSeq</CODE> before it can be used.
	   * @exception OutOfMemoryError
	   *   Indicates insufficient memory for creating the clone.
	   **/ 

	public Object clone()
	{
		try
		{
			return super.clone();
		}catch (CloneNotSupportedException e)
		{
			System.out.println("��ü ���� ����");
			return null;
		}
	}

	/**
	 * Create a new sequence that contains all the elements from one sequence
	 * followed by another.
	 * @param s1</CODE>
	 *   the first of two sequences
	 * @param s2</CODE>
	 *   the second of two sequences
	 * <dt><b>Precondition:</b><dd>
	 *   Neither s1 nor s2 is null.
	 * @return
	 *   a new sequence that has the elements of s1</CODE> followed by the
	 *   elements of s2</CODE> (with no current element)
	 * @exception NullPointerException.
	 *   Indicates that one of the arguments is null.
	 * @exception OutOfMemoryError
	 *   Indicates insufficient memory for the new sequence.
	 **/   
	public static DoubleLinkedSeq catenation(DoubleLinkedSeq s1,DoubleLinkedSeq s2)
	{
		if((s1.cursor==null)||(s2.cursor==null))
		{
			System.out.println("s1 �Ǵ� s2�� null�Դϴ�.");
			return null;
		}
		DoubleLinkedSeq s1_and_s2 = new DoubleLinkedSeq();
		for (int i=0;i<s1.size();i++)
		{
			s1_and_s2=(DoubleLinkedSeq)s1.clone();
		}
		s1_and_s2.addAll((DoubleLinkedSeq)s2.clone());
		return s1_and_s2;
		
	}
	/**
	 * Accessor method to get the current element of this sequence. 
	 * @param - none
	 * <dt><b>Precondition:</b><dd>
	 *   isCurrent()</CODE> returns true.
	 * @return
	 *   the current capacity of this sequence
	 * @exception IllegalStateException
	 *   Indicates that there is no current element, so 
	 *   getCurrent</CODE> may not be called.
	 **/
	public double getCurrent()
	{
		if (isCurrent())
		{
			return cursor.data;
		}
		else
		{
			System.out.println("cursor�� null�Դϴ�.");
			return 0;
		}
	}
	/**
	 * Accessor method to determine whether this sequence has a specified 
	 * current element that can be retrieved with the 
	 * getCurrent</CODE> method. 
	 * @param - none
	 * @return
	 *   true (there is a current element) or false (there is no current element at the moment)
	 **/
	public boolean isCurrent()
	{
		if (cursor==null)
			return false;
		else 
			return true;
	}
	/**
	 * Remove the current element from this sequence.
	 * @param - none
	 * <dt><b>Precondition:</b><dd>
	 *   isCurrent()</CODE> returns true.
	 * <dt><b>Postcondition:</b><dd>
	 *   The current element has been removed from this sequence, and the 
	 *   following element (if there is one) is now the new current element. 
	 *   If there was no following element, then there is now no current 
	 *   element.
	 * @exception IllegalStateException
	 *   Indicates that there is no current element, so 
	 *   removeCurrent</CODE> may not be called. 
	 **/
	public void removeCurrent( )
	{
		if (isCurrent()==false)
		{
			System.out.println("�̹� ����ִ� ����Ʈ�Դϴ�.");
			return;
		}
		else if (pre_cursor==null) //���Ұ� �� �տ� �ִ� ���
		{
			next=cursor.next;
			cursor=cursor.next;
			return;
		}
		else if (cursor.next==null) //���Ұ� �� �ڿ� �ִ� ���
		{
			System.out.println("�� �ڿ� �ִ� ���Ҵ� �� �� �����ϴ�.");
			return;
		}
		pre_cursor.next=cursor.next;
		cursor=cursor.next;
	}
	   
	/**
	 * Determine the number of elements in this sequence.
	 * @param - none
	 * @return
	 *   the number of elements in this sequence
	 **/ 
	public int size( )
	{
		int size=0;
		DoubleLinkedSeq find_size = new DoubleLinkedSeq(); //cursor���� �ջ��Ű�� �ʱ����� ����� DoubleLinkedSeq
		find_size=(DoubleLinkedSeq)clone();
		find_size.start();
		for (;find_size.cursor!=null;size++)
		{
			find_size.cursor=find_size.cursor.next;
		}
		return size;
	}
	   
	/**
	 * Set the current element at the front of this sequence.
	 * @param - none
	 * <dt><b>Postcondition:</b><dd>
	 *   The front element of this sequence is now the current element (but 
	 *   if this sequence has no elements at all, then there is no current 
	 *   element).
	 **/ 
	public void start( )
	{
		if (isCurrent()==false)
		{
			cursor=null;
		}
		cursor=next;
		pre_cursor=null;
	}
}
