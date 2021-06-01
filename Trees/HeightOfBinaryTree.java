
//Java program to find height of tree

//A binary tree node
class HNode
{
	int data;
	HNode left, right;

	HNode(int item)
	{
		data = item;
		left = right = null;
	}
}

class HeightOfBinaryTree
{
	HNode root;

	/* Compute the "maxDepth" of a tree -- the number of
	nodes along the longest path from the root node
	down to the farthest leaf node.*/
	int maxDepth(HNode node)
	{
		if (node == null)
			return 0;
		else
		{
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}
	}
	
	/* Driver program to test above functions */
	public static void main(String[] args)
	{
		HeightOfBinaryTree tree = new HeightOfBinaryTree();

		tree.root = new HNode(1);
		tree.root.left = new HNode(2);
		tree.root.right = new HNode(3);
		tree.root.left.left = new HNode(4);
		tree.root.left.right = new HNode(5);

		System.out.println("Height of tree is : " +
									tree.maxDepth(tree.root));
	}
}

//This code has been contributed by Mayank Jaiswal(mayank_24)
