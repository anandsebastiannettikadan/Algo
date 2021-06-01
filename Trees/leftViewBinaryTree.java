

//Java program to print left view of binary tree

/* Class containing left and right child of current
leftViewNode and key value*/
class leftViewNode {
	int data;
	leftViewNode left, right;

	public leftViewNode(int item)
	{
		data = item;
		left = right = null;
	}
}
class LeftViewBinaryTree_Max_level {

	int max_level;
}
 

/* Class to print the left view */
class leftViewBinaryTree {
	leftViewNode root;
	LeftViewBinaryTree_Max_level max = new LeftViewBinaryTree_Max_level();
//	static int max_level = 0;

	// recursive function to print left view
	void leftViewUtil(leftViewNode leftViewNode, int level, LeftViewBinaryTree_Max_level max_level)
	{
		// Base Case
		if (leftViewNode == null)
			return;

		// If this is the first leftViewNode of its level
		if (max_level.max_level < level) {
			System.out.print(" " + leftViewNode.data);
			max_level.max_level = level;
		}

		// Recur for left and right subtrees
		leftViewUtil(leftViewNode.left, level + 1,max_level);
		leftViewUtil(leftViewNode.right, level + 1,max_level);
	}

	// A wrapper over leftViewUtil()
	void leftView()
	{
		leftView(root);
	} 
	void leftView(leftViewNode node) {
		leftViewUtil(node,1,max);
	}

	/* testing for example leftViewNodes */
	public static void main(String args[])
	{
		/* creating a binary tree and entering the leftViewNodes */
		leftViewBinaryTree tree = new leftViewBinaryTree();
		tree.root = new leftViewNode(11);
		tree.root.left = new leftViewNode(10);
		tree.root.right = new leftViewNode(30);
		tree.root.right.left = new leftViewNode(25);
		tree.root.right.right = new leftViewNode(40);

		tree.leftView();
	}
}
