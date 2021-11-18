package level01;

public class Song04 {
	/*
	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		long num = 626331;  //4
		int count = 0;
		long ab = (long)num;
		while(count <= 500) {
			if(num == 1) break;
		    else if(num%2 == 0) num = num/2;
			else num = num*3 +1;
			count++;
		}
		System.out.println(count);
		if(count==501) count=-1;
	}
	
	class Solution {
	    public int solution(int num) {
	        int answer = 0;
	        return answer;
	    }
	}
}
