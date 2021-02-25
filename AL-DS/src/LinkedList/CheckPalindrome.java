package LinkedList;

public class CheckPalindrome {
	public static void main(String[] args) {
		//1-2-1-1
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(1);
				
		boolean res = CheckPalindrome.isPalindrome(head);
		System.out.println(res);
	}
	private static boolean isPalindrome(ListNode head) {
		if(head == null || head.next == null) {
			return true;
		}
		ListNode curr = head;
		
//		CheckPalindrome.print(curr);
		
		ListNode reverseHead = reverse(head);
//		CheckPalindrome.print(reverseHead);
		while(curr != null ) {
			if(curr.val != reverseHead.val) {
				return false;
			}
			curr = curr.next;
			reverseHead = reverseHead.next;
		}
		return true;
	}
	private static ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverse(head.next);
		head.next.next =head;
		head.next = null;
		return newHead;
	}
	private static void print(ListNode head) {
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}

}
