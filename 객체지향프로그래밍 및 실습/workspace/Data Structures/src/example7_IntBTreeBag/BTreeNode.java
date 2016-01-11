package example7_IntBTreeBag;

import java.util.ArrayList;

public class BTreeNode {
	private int 					minimum;
	private ArrayList<Integer>		data;
	private BTreeNode 				parentsNode;
	private ArrayList<BTreeNode> 	nodeList;

	
	
	BTreeNode(int inputMinimum,int inputData)
	{
		parentsNode = null;
		minimum=inputMinimum;
		data = new ArrayList<Integer>();
		nodeList = new ArrayList<BTreeNode>();
	}
	
	BTreeNode(int inputMinimum,int inputData,BTreeNode parentsNode)
	{
		minimum=inputMinimum;
		data = new ArrayList<Integer>();
	}
	
	BTreeNode(int inputMinimum,ArrayList<Integer> inputData)
	{
		parentsNode = null;
		minimum=inputMinimum;
		data = new ArrayList<Integer>();
		nodeList = new ArrayList<BTreeNode>();
		if (inputData.size()<minimum*2)
		{
			data.addAll(inputData);
		}
		else
		{
			for (int i=0;i<minimum*2;i++)
			{
				data.add(inputData.get(i));
			}
		}
	}
	
	BTreeNode(int inputMinimum,ArrayList<Integer> inputData,BTreeNode parentsNode)
	{

		minimum=inputMinimum;
		data = new ArrayList<Integer>();
	}
}
