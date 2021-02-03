package BinaryTree;

import java.util.ArrayList;
import java.util.List;

/*			5
		  /    \
		 3        8
		/   \        \
		1      4        11
		
result: [5, 3, 1, 4, 8, 11]
		*/

public class Pre_orderTraversalOfBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(8);
		TreeNode n4 = new TreeNode(1);
		TreeNode n5 = new TreeNode(4);
		TreeNode n6 = new TreeNode(11);
		
		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		List<Integer> res = preOrderTraveral(root);
		System.out.println(res);
	}
	
	private static List<Integer> preOrderTraveral(TreeNode root){
		List<Integer> result = new ArrayList<>();
		if(root == null) {		
			return result;
		}	
		helper(root, result);
		return result;
			
	}
	
	private static void helper(TreeNode root, List<Integer> result) {
		if(root == null) {
			return;
		}
		result.add(root.val);
		helper(root.left, result);
		helper(root.right, result);
	}

}
