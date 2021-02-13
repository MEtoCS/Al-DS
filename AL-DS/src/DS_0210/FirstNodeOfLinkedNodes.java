package DS_0210;

public class FirstNodeOfLinkedNodes {
	public static void main(String[] args) {
		ListNode root1 = new ListNode(3);
		ListNode n2 = new ListNode(6);
		ListNode n3 = new ListNode(9);
		ListNode n4 = new ListNode(15);
		ListNode n5 = new ListNode(30);
		root1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		ListNode root2 = new ListNode(10);
		ListNode node2 = new ListNode(15);
		ListNode node3 = new ListNode(30);
		root2.next = node2;
		node2.next = node3;
		
		// 3-6-9-15-30
		// 10-15-30
		//output: 15
		FirstNodeOfLinkedNodes obj1 = new FirstNodeOfLinkedNodes();
		int res = obj1.firstCommonNodeValue(root1, root2);
		System.out.println(res);
		
	}
	
	private int firstCommonNodeValue(ListNode n1, ListNode n2) {
		ListNode cur1 = n1;
		ListNode cur2 = n2;
		while(cur1 != null) {
			ListNode temp = cur1;
			
			while(cur2 != null ) {
				ListNode temp2 = cur2;
				
				if(temp.val == temp2.val) {
					return temp.val;
				}else {
					cur2 = cur2.next;
				}
				
			}
			cur1 = cur1.next;
		}
		return Integer.MIN_VALUE;
	}
	

	
	

}
