package level01;

public class Song004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		[1,2,3,4]	1
		[1,2,7,6,4]	4
*/
		int[] nums = {1,2,3,4};
		
		int answer = 0;
		for(int i = 0 ; i < nums.length-2 ; i++) {
			for(int j = i+1 ; j <nums.length-1 ; j++) {
				for(int k = j+1 ; k < nums.length; k++) {
					if(checkValue(nums[i]+nums[j]+nums[k])) answer += 1;
				}
			}
		}
		
	}
	public static boolean checkValue(int num) {
	    int cnt = 0;
        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
            if(num % i == 0) cnt += 1; 
        }
        boolean isTrue = cnt == 1 ? true : false;
        return isTrue;
	}
	class Solution {
	    public int solution(int[] nums) {
	        int answer = -1;
	        return answer;
	    }
	}
}
