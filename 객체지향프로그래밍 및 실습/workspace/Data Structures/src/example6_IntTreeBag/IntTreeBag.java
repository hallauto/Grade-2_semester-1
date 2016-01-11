
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
		   System.out.println("addend가 null입니다.");
		   return;
	   }
	   else
	   {
		   addpreorder(addend.getRoot());
	   }
   }
   /*
    * addAll 메소드에서만 쓰이는 inner method.
    * 인자:IntBTNode root
    * 	addend 트리의 루트노드
    * addend 트리를 전위 탐방을 하면서 모든 노드를 추가한다.
    * 후결조건:addend를 전위 탐방으로 조사해서 모든 노드를 추가한다. 추가한 후에도 이진 탐색 트리의 조건을 만족해야한다.
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
		  System.out.println("트리가 비어있습니다.");
		  return 0;
	  }
	  else
	  {
		  count=countPosorder(root,target);
	  }
      return count;
   }
   /*
    * countOccurrences메소드에서만 쓰이는 inner method
    * 인자:IntBTNode root
    * 	검색하고자하는 트리의 루트 노드
    * @param <CODE>target</CODE>
    *   the element that needs to be counted
    * @return
    * 	서브트리와 자기자신을 포함해서 target과 같은 data를 가진 IntBTNode의 수
    * root노드를 후위 탐방하면서 모든 노드를 찾아가서 target과 같은 data를 가진 노드가 몇개인지 찾는다.
    * 후결조건:target이 root의 data와 같으면 자식 노드 또는 부트리에서 return한 count를 합한것에 +1을 해서 return한다.
    * 		반대의 경우에는 +1을 하지않고 return한다.
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
    * 루트노드를 return하는 함수입니다.
    * return
    * 	root 인스턴스 
    */
   public IntBTNode getRoot()
   {
	   return root;
   }
}
           
