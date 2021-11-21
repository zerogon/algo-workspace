package level01;

import java.util.HashSet;
import java.util.Set;

public class Kim06 {
/*	
	[2,1,3,4,1]	[2,3,4,5,6,7]
	[5,0,2,7]	[2,5,7,9,12]
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5 7 12 2 7 9
		// 2 5 7 9 12
		int[] numbers = { 2,1,3,4,1 };
		Set<Integer> st = new HashSet<Integer>();
		
		
		for(int i = 0 ; i < numbers.length-1 ; i++) {
			for(int j = i+1 ; j < numbers.length; j++) {
				st.add(numbers[i]+numbers[j]);
			}
		}

		int[] answer = st.stream().mapToInt(Integer::intValue).toArray();
	}
	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = {};
	        return answer;
	    }
	}
}
