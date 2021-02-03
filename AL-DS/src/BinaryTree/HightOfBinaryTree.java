package BinaryTree;
/*			
 			5
		/    \
		3        8
	/   \        \
	1      4        11

*/
public class HightOfBinaryTree {
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
		
		int res = hightOfBinaryTree(n6);
		System.out.println(res);
		
	}
	
	private static int hightOfBinaryTree(TreeNode root){
		if(root == null) {
			return 0;
		}
		
		return Math.max(hightOfBinaryTree(root.left), hightOfBinaryTree(root.right))+1;
	}

}
