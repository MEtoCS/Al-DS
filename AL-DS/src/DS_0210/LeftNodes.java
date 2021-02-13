package DS_0210;

import java.util.ArrayList;
import java.util.List;

public class LeftNodes {
	public static void main(String[] args) {
//		Input : 
//            1
//          /   \
//         2     3
//        / \     \
//       4   5     6             
//		Output : 1 2 4
		TreeNode root = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		root.left = n2;
		root.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		LeftNodes obj1 = new LeftNodes();
		List<Integer> res = obj1.leftTravere(root);
		System.out.println(res);
		
	}
	
	private List<Integer> leftTravere(TreeNode root){
		List<Integer> result = new ArrayList<>();
		
		left(root, result);
		return result;
	}
	
	private void left(TreeNode root, List<Integer> result) {
		if(root == null) {
			return;
		}
		result.add(root.val);
		left(root.left, result);
	}
	
	

}
