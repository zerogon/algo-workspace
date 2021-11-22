package level01;

import java.util.stream.IntStream;

public class Song07 {
	/*
	 * 
	 * 
5 3
*****
*****
*****
	*/
	public static void main(String[] args) {
        int a = 5;
        int b = 3;
        		/*
        for(int i = 0 ; i < b ; i ++) {
        	for(int j = 0 ; j < a ; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        */
        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s->sb.append("*"));
        IntStream.range(0, b).forEach(s->System.out.println(sb.toString()));
        
	}
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        return answer;
	    }
	}
}
