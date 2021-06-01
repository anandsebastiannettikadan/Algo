
//Java program to print BST in given range 

//A binary tree node 
class Node3 { 
	
	int data; 
	Node3 left, right; 
	
	Node3(int d) { 
		data = d; 
		left = right = null; 
	} 
} 

class sortedArrayIntoBalancedBST { 
	
	static Node3 root; 

	/* A function that constructs Balanced Binary Search Tree 
	from a sorted array */
	Node3 sortedArrayToBST(int arr[], int start, int end) { 

		/* Base Case */
		if (start > end) { 
			return null; 
		} 

		/* Get the middle element and make it root */
		int mid = (start + end) / 2; 
		Node3 node = new Node3(arr[mid]); 

		/* Recursively construct the left subtree and make it 
		left child of root */
		node.left = sortedArrayToBST(arr, start, mid - 1); 

		/* Recursively construct the right subtree and make it 
		right child of root */
		node.right = sortedArrayToBST(arr, mid + 1, end); 
		
		return node; 
	} 

	/* A utility function to print preorder traversal of BST */
	void preOrder(Node3 node) { 
		if (node == null) { 
			return; 
		} 
		System.out.print(node.data + " "); 
		preOrder(node.left); 
		preOrder(node.right); 
	} 
	
	public static void main(String[] args) { 
		sortedArrayIntoBalancedBST tree = new sortedArrayIntoBalancedBST(); 
		int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7}; 
		int n = arr.length; 
		root = tree.sortedArrayToBST(arr, 0, n - 1); 
		System.out.println("Preorder traversal of constructed BST"); 
		tree.preOrder(root); 
	} 
} 