
//non-recursive java program for inorder traversal
import java.util.Stack;

/* Class containing left and right child of
current node and key value*/
class TNode
{
	int data;
	TNode left, right;

	public TNode(int item)
	{
		data = item;
		left = right = null;
	}
}

/* Class to print the inorder traversal */
class inorderIterative
{
	TNode root;
	void inorder()
	{
		if (root == null)
			return;


		Stack<TNode> s = new Stack<TNode>();
		TNode curr = root;

		// traverse the tree
		while (curr != null || s.size() > 0)
		{

			/* Reach the left most Node of the
			curr Node */
			while (curr != null)
			{
				/* place pointer to a tree node on
				the stack before traversing
				the node's left subtree */
				s.push(curr);
				curr = curr.left;
			}

			/* Current must be NULL at this point */
			curr = s.pop();

			System.out.print(curr.data + " ");

			/* we have visited the node and its
			left subtree. Now, it's right
			subtree's turn */
			curr = curr.right;
		}
	}

	public static void main(String args[])
	{

		/* creating a binary tree and entering
		the nodes */
		inorderIterative tree = new inorderIterative();
		tree.root = new TNode(1);
		tree.root.left = new TNode(2);
		tree.root.right = new TNode(3);
		tree.root.left.left = new TNode(4);
		tree.root.left.right = new TNode(5);
		tree.inorder();
	}
	
}
