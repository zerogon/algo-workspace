package level01;

public class Song02 {
/*
	[1,2,3,4]	2.5
	[5,5]	5
*/	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int arrSize = arr.length;
		int sum = 0;
		for(int i = 0; i< arrSize ; i++) {
			sum += arr[i];
		}
		double answer  = sum / arrSize;
		
	}
	
	class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
			int arrSize = arr.length;
			int sum = 0;
			for(int i = 0; i< arrSize ; i++) {
				sum += arr[i];
			}
			answer  = sum / arrSize;
	        return answer;
	    }
	}
}
