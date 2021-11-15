package level01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Song01 {
/*
[1,2,3,4]	[-3,-1,0,2]	3
[-1,0,1]	[1,0,-1]	-2

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		int answer = 0;
		//BinaryOperator<Integer> biOper = (a, b) ->
		for(int i = 0; i < a.length; i++) {
			answer+= a[i]*b[i];
		}
		System.out.println(answer);
		
	}
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 1234567890;
	        return answer;
	    }
	}
}
