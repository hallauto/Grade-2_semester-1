package example6_IntTreeBag;

public class Tester {
	public static void main(String agrs[]) throws CloneNotSupportedException
	{
		/*
		 * IntTreeBag클래스의 시연을 위한 클래스
		 */
		IntBTNode get = new IntBTNode(7,null,null);
		IntTreeBag myTree = new IntTreeBag();
		IntTreeBag myTree2 = new IntTreeBag();
		IntTreeBag addAllTree = new IntTreeBag();
		IntTreeBag unionTree = new IntTreeBag();
		IntTreeBag clonemyTree;
		//add 메소드 시험
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
		//IntBTNode에 있는 중위탐방 출력 메소드 inorderPrint 메소드 시험
		System.out.println("myTree");
		myTree.getRoot().inorderPrint();
		System.out.println("\nmyTree2");
		myTree2.getRoot().inorderPrint();
		//size메소드 확인
		System.out.println("\nmyTree의 크기:"+myTree.size()+" myTree2의 크기:"+myTree2.size()+"\n");
		//countOccurrences 메소드 시험
		System.out.println("myTree내의 5의 갯수:"+myTree.countOccurrences(5));
		System.out.println("myTree내의 20의 갯수:"+myTree.countOccurrences(20));
		//clone 메소드 시험
		clonemyTree = (IntTreeBag)myTree.clone();
		//정상적으로 복사되었는지 inorderPrint로 확인
		System.out.println("\nclonemyTree");
		clonemyTree.getRoot().inorderPrint();
		//remove 메소드 확인
		clonemyTree.remove(10);
		//정상적으로 삭제되었는지 inorderPrint로 확인
		System.out.println("\nclonemyTree remove(10)");
		clonemyTree.getRoot().inorderPrint();
		//addAll 메소드 확인
		clonemyTree.addAll(myTree2);
		System.out.println("\ncloneTree addAll");
		clonemyTree.getRoot().inorderPrint();
		//clone으로 복사한 인스턴스가 원본에 영향을 주지 않는지 확인
		System.out.println("\nmyTree");
		myTree.getRoot().inorderPrint();
		System.out.println();
		//union 메소드 확인
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
