package example4_Bag_of_Integers;

public class Bag_Integers {
	private int[] bag;
	private int manyitems;
	private int capacity;
	/*
	 *변수(variable)
	 *bag:값이 담길 가방
	 *manyitems:가방안에 현재 들어있는 물품의 수량
	 *capacity:가방의 크기 
	 */
	public Bag_Integers()
	{
		capacity=10;
		bag=new int[capacity];
		manyitems=0;
	}
	public Bag_Integers(int capacity_input)
	/*
	 * 생성자
	 * 인자:capacity_input:가방의 크기값이 될 입력 값
	 * 선결조건:capacity_input>0
	 * 후결조건:이 가방은 비어있어야한다. 크기는 0보다 커야한다.
	 */
	{
		capacity=capacity_input;
		bag=new int[capacity];
		manyitems=0;
	}
	public void Input_item(int input)
	/*
	 * 가방에 값을 집어넣는 메소드
	 * Modification method
	 * 인자:input:Bag에 넣을 값
	 * 선결조건:만약 용량이 모자라면 기존 가방을 용량이 1 더 큰 가방으로 대체
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
	 * 가방의 용량이 모자랄때, 가방의 용량을 확장시키는 메소드
	 * Modification method
	 * 인자:bag:클래스 변수 bag
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
