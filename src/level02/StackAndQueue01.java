package level02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueue01 {

	public static void main(String[] args) {
		/*
		[93, 30, 55]	[1, 30, 5]	[2, 1]
		[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
		*/
/*		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
*/		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] answer = {};
		Queue<Integer> qu = new LinkedList<>();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i = 0; i < progresses.length; i++) {
			double workday = Math.ceil((double)(100 - progresses[i])/speeds[i]);
			qu.offer((int)workday);
		}
		
		int count = 1;
		while(!qu.isEmpty()) {
			int target = qu.poll();
			if(qu.peek()!=null && target>=qu.peek()) {
				count+=1;
			}else {
				ar.add(count);
				count = 1;
			}
		}
		answer = ar.stream().mapToInt(Integer::intValue).toArray();
		
		
		
	}
	
	
	class Solution {
	    public int[] solution(int[] progresses, int[] speeds) {
	    	int[] answer = {};
	        return answer;
	    }
	}

}
