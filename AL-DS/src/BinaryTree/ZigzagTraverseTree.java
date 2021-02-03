package BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//class TreeNode {
//	public int val;
//	public TreeNode left;
//	public TreeNode right;
//
//	public TreeNode() {
//	}
//
//	public TreeNode(int x) {
//		val = x;
//	}
//
//}

public class ZigzagTraverseTree {
	public static void main(String[] args) {
		TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node2.left = node7;
        node2.right = node6;
        node3.left = node5;
        node3.right = node4;
//        node6.right = node7;
//        node3.right = node5;
        
        ZigzagTraverseTree obj1 = new ZigzagTraverseTree();
        List<Integer> res= obj1.zigzagTraverseTree(node1);
        System.out.println(res);
        
	}
	
	private List<Integer> zigzagTraverseTree(TreeNode root){
		//corner case
		if(root == null) {
			return new ArrayList<Integer>();
		}
		//general case
		Deque<TreeNode> deque = new ArrayDeque<>();
		List<Integer> result = new ArrayList<>();
		
		int level = 1;
		deque.offerFirst(root);
		while(!deque.isEmpty()) {
			int size = deque.size();
			for(int i = 0; i< size; i++) {
				if(level ==0) {
					TreeNode temp = deque.pollLast();
					result.add(temp.val);
					if(temp.right!=null) {
						deque.offerFirst(temp.right);
					}
					if(temp.left!= null) {
						deque.offerFirst(temp.left);
					}
				}else {
					TreeNode temp = deque.pollFirst();
					result.add(temp.val);
					if(temp.left != null) {
						deque.offerLast(temp.left);
					}
					if(temp.right != null) {
						deque.offerLast(temp.right);
					}
				}
			}
			level = 1 - level;
		}
		
		return result;
		

	}
	

}


