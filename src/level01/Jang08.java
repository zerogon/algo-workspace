package level01;

public class Jang08 {
/*
	13	17	43
	24	27	52
	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 24;
		int right = 27;
		int sum = 0;
		for(int i = left ; i <= right ; i++) {
			int cnt = 0;
			for(int j = 1 ; j <= i ; j++) {
				if(i%j == 0) {
					cnt ++;
				}
			}
			sum = cnt%2 != 0 ? sum - i : sum + i; 
		}
		System.out.println(sum);
	}
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        return answer;
	    }
	}
}
