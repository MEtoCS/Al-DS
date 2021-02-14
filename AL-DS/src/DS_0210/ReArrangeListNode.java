package DS_0210;

public class ReArrangeListNode {
	public static void main(String[] args) {
		//input: a->b->c->d->e->f
//		         			o :a->c ->e
//		         					e:b->d->f
		//output: a->c->e->b->d->f
		        
		//odd: head -->
		//even: head.next -->
		//FirstEven = even
		
		
		//travese for odd:  
		
		
		Node head = new Node('a');
		Node n2 = new Node('b');
		Node n3 = new Node('c');
		Node n4 = new Node('d');
		Node n5 = new Node('e');
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next =n5;
		
		ReArrangeListNode obj1 = new ReArrangeListNode();
		obj1.print(head);
		Node result = obj1.reArrangeNodes(head);
//		obj1.print(result);
		
		
		
	}
	private Node reArrangeNodes(Node head) {
		//corner case
		if(head == null || head.next ==null) {
			return head;
		}
		
		//general case
		//input: a->b->c->d->e->f
//			     				o : a->c->e
//					e:b->d->f
//output: a->c->e->b->d->f
		Node odd = head;
		Node even = head.next;
		Node evenFirst = even;
		while(true) {
			//terminate condition for even 
			if(even ==null || even.next == null || odd.next!=null) {
				odd.next  = evenFirst;
				break;
			}			
			odd.next = even.next;
			odd = even.next;	
			
			//terminate condition for odd
			if(odd.next == null) {
				even.next = null;
				odd.next = evenFirst;
				break;
			}
			
			even.next = odd.next;
			even = odd.next;
		
		}
		return head;
	}
	
	private void print(Node h) {
		while(h!=null) {
			System.out.println(h.val);
			h=h.next;
		}
	}

}
