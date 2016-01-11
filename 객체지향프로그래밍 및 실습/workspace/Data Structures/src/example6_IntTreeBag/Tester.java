package example6_IntTreeBag;

public class Tester {
	public static void main(String agrs[]) throws CloneNotSupportedException
	{
		/*
		 * IntTreeBagŬ������ �ÿ��� ���� Ŭ����
		 */
		IntBTNode get = new IntBTNode(7,null,null);
		IntTreeBag myTree = new IntTreeBag();
		IntTreeBag myTree2 = new IntTreeBag();
		IntTreeBag addAllTree = new IntTreeBag();
		IntTreeBag unionTree = new IntTreeBag();
		IntTreeBag clonemyTree;
		//add �޼ҵ� ����
		myTree.add(10);
		myTree.add(5);
		myTree.add(100);
		myTree.add(7);
		myTree.add(9);
		myTree.add(5);
		
		myTree2.add(75);
		myTree2.add(13);
		myTree2.add(82);
		myTree2.add(41);
		myTree2.add(6);
		//IntBTNode�� �ִ� ����Ž�� ��� �޼ҵ� inorderPrint �޼ҵ� ����
		System.out.println("myTree");
		myTree.getRoot().inorderPrint();
		System.out.println("\nmyTree2");
		myTree2.getRoot().inorderPrint();
		//size�޼ҵ� Ȯ��
		System.out.println("\nmyTree�� ũ��:"+myTree.size()+" myTree2�� ũ��:"+myTree2.size()+"\n");
		//countOccurrences �޼ҵ� ����
		System.out.println("myTree���� 5�� ����:"+myTree.countOccurrences(5));
		System.out.println("myTree���� 20�� ����:"+myTree.countOccurrences(20));
		//clone �޼ҵ� ����
		clonemyTree = (IntTreeBag)myTree.clone();
		//���������� ����Ǿ����� inorderPrint�� Ȯ��
		System.out.println("\nclonemyTree");
		clonemyTree.getRoot().inorderPrint();
		//remove �޼ҵ� Ȯ��
		clonemyTree.remove(10);
		//���������� �����Ǿ����� inorderPrint�� Ȯ��
		System.out.println("\nclonemyTree remove(10)");
		clonemyTree.getRoot().inorderPrint();
		//addAll �޼ҵ� Ȯ��
		clonemyTree.addAll(myTree2);
		System.out.println("\ncloneTree addAll");
		clonemyTree.getRoot().inorderPrint();
		//clone���� ������ �ν��Ͻ��� ������ ������ ���� �ʴ��� Ȯ��
		System.out.println("\nmyTree");
		myTree.getRoot().inorderPrint();
		System.out.println();
		//union �޼ҵ� Ȯ��
		clonemyTree=(IntTreeBag)myTree.clone();
		unionTree=IntTreeBag.union(myTree,myTree2);
		System.out.println("\nmyTree");
		myTree.getRoot().inorderPrint();
		System.out.println("\nmyTree2");
		myTree2.getRoot().inorderPrint();
		System.out.println("\nunionTree");
		unionTree.getRoot().inorderPrint();
	}
}
