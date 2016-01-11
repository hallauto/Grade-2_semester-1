package example4_Bag_of_Integers;

public class Bag_Integers {
	private int[] bag;
	private int manyitems;
	private int capacity;
	/*
	 *����(variable)
	 *bag:���� ��� ����
	 *manyitems:����ȿ� ���� ����ִ� ��ǰ�� ����
	 *capacity:������ ũ�� 
	 */
	public Bag_Integers()
	{
		capacity=10;
		bag=new int[capacity];
		manyitems=0;
	}
	public Bag_Integers(int capacity_input)
	/*
	 * ������
	 * ����:capacity_input:������ ũ�Ⱚ�� �� �Է� ��
	 * ��������:capacity_input>0
	 * �İ�����:�� ������ ����־���Ѵ�. ũ��� 0���� Ŀ���Ѵ�.
	 */
	{
		capacity=capacity_input;
		bag=new int[capacity];
		manyitems=0;
	}
	public void Input_item(int input)
	/*
	 * ���濡 ���� ����ִ� �޼ҵ�
	 * Modification method
	 * ����:input:Bag�� ���� ��
	 * ��������:���� �뷮�� ���ڶ�� ���� ������ �뷮�� 1 �� ū �������� ��ü
	 */
	{
		if (manyitems==capacity-1)
		{
			bag=Bag_expansion(bag);
		}
		bag[manyitems]=input;
		manyitems++;
	}
	public int[] Bag_expansion(int bag[])
	/*
	 * ������ �뷮�� ���ڶ���, ������ �뷮�� Ȯ���Ű�� �޼ҵ�
	 * Modification method
	 * ����:bag:Ŭ���� ���� bag
	 * 
	 */
	{
		int expanded_bag[]= new int [manyitems+1];
		System.arraycopy(bag, 0, expanded_bag, 0, manyitems+1);
		return expanded_bag;
	}
	public Bag_Integers Bag_clone(Bag_Integers Bag)
	{
		Bag_Integers clone_Bag = new Bag_Integers(capacity);
		
		return clone_Bag;
	}
}
