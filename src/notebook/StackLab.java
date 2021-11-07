package notebook;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
			System.out.println(st.size());
		}
		
		Queue<Integer> qe = new LinkedList<>();
		
		qe.offer(10);
		qe.offer(20);
		qe.offer(30);
		
		while(!qe.isEmpty()) {
			System.out.println(qe.poll());
		}
	}

}
