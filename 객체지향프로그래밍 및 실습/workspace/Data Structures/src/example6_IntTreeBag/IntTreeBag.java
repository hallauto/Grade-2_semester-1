
package example6_IntTreeBag;

/******************************************************************************
* This class is a homework assignment;
* An <CODE>IntTreeBag</CODE> is a collection of int numbers.
*
* <dl><dt><b>Limitations:</b> <dd>
*   Beyond <CODE>Integer.MAX_VALUE</CODE> elements, <CODE>countOccurrences</CODE>,
*   and <CODE>size</CODE> are wrong. 
*
* <dt><b>Outline of Java Source Code for this class:</b><dd>
*   <A HREF="../../../../edu/colorado/collections/IntTreeBag.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/collections/IntTreeBag.java
*   </A>
*
* <dt><b>Note:</b><dd>
*   This file contains only blank implementations ("stubs")
*   because this is a Programming Project for my students.
*
* @version
*   Jan 24, 1999
*
* @see IntArrayBag
* @see IntLinkedBag
******************************************************************************/
public class IntTreeBag implements Cloneable
{
   // Invariant of the IntTreeBag class:
   //   1. The elements in the bag are stored in a binary search tree.
   //   2. The instance variable root is a reference to the root of the
   //      binary search tree (or null for an empty tree).
   private IntBTNode root;
   private IntBTNode cursor;

   /**
   * Insert a new element into this bag.
   * @param <CODE>element</CODE>
   *   the new element that is being inserted
   * <dt><b>Postcondition:</b><dd>
   *   A new copy of the element has been added to this bag.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory a new IntBTNode.
   **/
   public void add(int element)
   {   
	   cursor = root;
	   IntBTNode addNod = new IntBTNode(element, null, null);
	   if (root==null)
	   {
		   root=addNod;
		   return;
	   }
	   while (true)
	   {
		   if ((element<cursor.getData())||(element==cursor.getData()))
		   {
			   if (cursor.getLeft()==null)
			   {
				   cursor.setLeft(addNod);
				   break;
			   }
			   else
			   {
				   cursor=cursor.getLeft();
				   continue;
			   }
		   }
		   else
		   {
			   if (cursor.getRight()==null)
			   {
				   cursor.setRight(addNod);
				   break;
			   }
			   else
			   {
				   cursor=cursor.getRight();
			   }
		   }
	   }
   }
   
   /**
   * Insert a new node into this bag.
   * @param <CODE>insult</CODE>
   *   the new node that is being inserted
   * <dt><b>Postcondition:</b><dd>
   *   A new node has been added to this bag.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory a new IntBTNode.
   **/
   public void add(IntBTNode insult)
   {   
	   cursor = root;
	   if (root==null)
	   {
		   root=insult;
		   return;
	   }
	   while (true)
	   {
		   if (insult.getData()<cursor.getData())
		   {
			   if (cursor.getLeft()==null)
			   {
				   cursor.setLeft(insult);
				   break;
			   }
			   else
			   {
				   cursor=cursor.getLeft();
			   }
		   }
		   else
		   {
			   if (cursor.getRight()==null)
			   {
				   cursor.setRight(insult);
				   break;
			   }
			   else
			   {
				   cursor=cursor.getRight();
			   }
		   }
	   }
   }
   /**
   * Add the contents of another bag to this bag.
   * @param <CODE>addend</CODE>
   *   a bag whose contents will be added to this bag
   * <dt><b>Precondition:</b><dd>
   *   The parameter, <CODE>addend</CODE>, is not null.
   * <dt><b>Postcondition:</b><dd>
   *   The elements from <CODE>addend</CODE> have been added to this bag.
   * @exception IllegalArgumentException
   *   Indicates that <CODE>addend</CODE> is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory to increase the size of the bag.
   **/
   public void addAll(IntTreeBag addend)
   {
	   if (addend == null)
	   {
		   System.out.println("addend�� null�Դϴ�.");
		   return;
	   }
	   else
	   {
		   addpreorder(addend.getRoot());
	   }
   }
   /*
    * addAll �޼ҵ忡���� ���̴� inner method.
    * ����:IntBTNode root
    * 	addend Ʈ���� ��Ʈ���
    * addend Ʈ���� ���� Ž���� �ϸ鼭 ��� ��带 �߰��Ѵ�.
    * �İ�����:addend�� ���� Ž������ �����ؼ� ��� ��带 �߰��Ѵ�. �߰��� �Ŀ��� ���� Ž�� Ʈ���� ������ �����ؾ��Ѵ�.
    */
   private void addpreorder (IntBTNode root)
   {
	   add(root.getData());
	   if (root.getLeft()!=null)
	   {
		   addpreorder(root.getLeft());
	   }
	   if (root.getRight()!=null)
	   {
		   addpreorder(root.getRight());
	   }
   }
   
   
   /**
   * Generate a copy of this bag.
   * @param - none
   * @return
   *   The return value is a copy of this bag. Subsequent changes to the
   *   copy will not affect the original, nor vice versa. Note that the return
   *   value must be type cast to an <CODE>IntTreeBag</CODE> before it can be used.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public Object clone( ) throws CloneNotSupportedException
   {  
	   IntTreeBag cloneBag = (IntTreeBag)super.clone();
	   IntTreeBag Return = new IntTreeBag();
	   Return.addAll(cloneBag);
	   return Return;
   }
   
  
   /**
   * Accessor method to count the number of occurrences of a particular element
   * in this bag.
   * @param <CODE>target</CODE>
   *   the element that needs to be counted
   * @return
   *   the number of times that <CODE>target</CODE> occurs in this bag
   **/
   public int countOccurrences(int target)
   {
	  int count;
	  if (root == null)
	  {
		  System.out.println("Ʈ���� ����ֽ��ϴ�.");
		  return 0;
	  }
	  else
	  {
		  count=countPosorder(root,target);
	  }
      return count;
   }
   /*
    * countOccurrences�޼ҵ忡���� ���̴� inner method
    * ����:IntBTNode root
    * 	�˻��ϰ����ϴ� Ʈ���� ��Ʈ ���
    * @param <CODE>target</CODE>
    *   the element that needs to be counted
    * @return
    * 	����Ʈ���� �ڱ��ڽ��� �����ؼ� target�� ���� data�� ���� IntBTNode�� ��
    * root��带 ���� Ž���ϸ鼭 ��� ��带 ã�ư��� target�� ���� data�� ���� ��尡 ����� ã�´�.
    * �İ�����:target�� root�� data�� ������ �ڽ� ��� �Ǵ� ��Ʈ������ return�� count�� ���ѰͿ� +1�� �ؼ� return�Ѵ�.
    * 		�ݴ��� ��쿡�� +1�� �����ʰ� return�Ѵ�.
    */
   private int countPosorder (IntBTNode root,int target)
   {
	   int count=0;
	   if (root.getLeft()!=null)
	   {
		   count+=countPosorder(root.getLeft(),target);
	   }
	   if (root.getRight()!=null)
	   {
		   count+=countPosorder(root.getRight(),target);
	   }
	   if (root.getData()==target)
	   {
		   return ++count;
	   }
	   else
	   {
		   return count;
	   }
   }
             
   /**
   * Remove one copy of a specified element from this bag.
   * @param <CODE>target</CODE>
   *   the element to remove from the bag
   * <dt><b>Postcondition:</b><dd>
   *   If <CODE>target</CODE> was found in the bag, then one copy of
   *   <CODE>target</CODE> has been removed and the method returns true. 
   *   Otherwise the bag remains unchanged and the method returns false. 
   **/
   public boolean remove(int target)
   {
	   IntBTNode targetNode = root;
	   IntBTNode targetNodeParents = null;
	   IntBTNode succesion;
	   IntBTNode succesionParents = null;
	   while (true)
	   {
		   if ((targetNode!=null)&&(targetNode.getData()!=target))
		   {
			   targetNodeParents=targetNode;
			   if (targetNode.getData()>target)
			   {
				   targetNode=targetNode.getLeft();
			   }
			   else
			   {
				   targetNode=targetNode.getRight();
			   }
		   }
		   else if (targetNode == null)
		   {
			   return false;
		   }
		   else if (targetNode.getData()==target)
		   {
			   break;
		   }
	   }
	   if ((targetNode.getLeft()!=null)&&(targetNode.getRight()!=null))
	   {
		   succesion=targetNode.getLeft();
		   succesionParents=targetNode;
		   while (succesion.getRight()!=null)
		   {
			   succesionParents=succesion;
			   succesion=succesion.getRight();
		   }
	   }
	   else
	   {
		   if (targetNode.getLeft()==null)
		   {
			   succesion=targetNode.getRight();
		   }
		   else
		   {
			   succesion=targetNode.getLeft();
		   }
	   }
	   if (targetNode == root)
	   {
		   succesionParents.setRight(null);
		   succesion.setLeft(root.getLeft());
		   succesion.setRight(root.getRight());
		   root=succesion;
	   }
	   else
	   {
		   if (targetNodeParents.getLeft()==targetNode)
		   {
			   targetNodeParents.setLeft(succesion);
		   }
		   else
		   {
			   targetNodeParents.setRight(succesion);
		   }
	   }
	   return true;
   }
      
   /**
   * Determine the number of elements in this bag.
   * @param - none
   * @return
   *   the number of elements in this bag
   **/                           
   public int size( )
   {
      return IntBTNode.treeSize(root);
   }
   

   /**
   * Create a new bag that contains all the elements from two other bags.
   * @param <CODE>b1</CODE>
   *   the first of two bags
   * @param <CODE>b2</CODE>
   *   the second of two bags
   * <dt><b>Precondition:</b><dd>
   *   Neither b1 nor b2 is null.
   * @return
   *   the union of b1 and b2
   * @exception IllegalArgumentException
   *   Indicates that one of the arguments is null.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for the new bag.
   **/   
   public static IntTreeBag union(IntTreeBag b1, IntTreeBag b2)
   {
	   if ((b1==null)||(b2==null))
	   {
		   return null;   
	   }
	   else
	   {
		   IntTreeBag unionTree = new IntTreeBag();
		   unionTree.addAll(b1);
		   unionTree.addAll(b2);
		   return unionTree;
	   }
   }
   /*
    * ��Ʈ��带 return�ϴ� �Լ��Դϴ�.
    * return
    * 	root �ν��Ͻ� 
    */
   public IntBTNode getRoot()
   {
	   return root;
   }
}
           
