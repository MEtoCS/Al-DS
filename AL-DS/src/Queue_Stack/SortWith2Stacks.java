package Queue_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SortWith2Stacks {
	public static void main(String[] args) {
		Deque<Integer> stack = new LinkedList<>();
		SortWith2Stacks obj1 = new SortWith2Stacks();
		stack.offerFirst(2);
		stack.offerFirst(6);
		stack.offerFirst(3);
		stack.offerFirst(1);

		obj1.sort(stack);
		System.out.println("===========" + stack.size());

		while (stack.size() > 0) {
			Integer res = stack.pollFirst();
			System.out.println(res);
		}
	}

	private void sort(Deque<Integer> stack) {
		if (stack.isEmpty() || stack.size() <= 1) {
			return;
		}
		Deque<Integer> buffer = new LinkedList<>();
		sort(stack, buffer);

	}

	private void sort(Deque<Integer> in, Deque<Integer> buffer) {
		while (!in.isEmpty()) {
			int curMin = Integer.MAX_VALUE;
			int count = 0;
			while (!in.isEmpty()) {
				int cur = in.pollFirst();
				if (cur < curMin) {
					curMin = cur;
					count = 1;
				} else if (cur == curMin) {
					count++;
				}
				buffer.offerFirst(cur);
			}
			while (!buffer.isEmpty() && buffer.peekFirst() >= curMin) {
				int temp = buffer.pollFirst();
				if (temp != curMin) {
					in.offerFirst(temp);
				}

			}
			while (count > 0) {
				buffer.offerFirst(curMin);
				count--;
			}
		}

		while (!buffer.isEmpty()) {
			in.offerFirst(buffer.pollFirst());
		}
	}
	
//	private void print(Deque<Integer> stack) {
//		Integer res = stack.pollFirst();
//		while(!stack.isEmpty()) {
//			
//			System.out.println(res);
//		}
//	}

}
