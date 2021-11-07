package level01;

import java.util.ArrayList;
import java.util.List;

public class Song05 {
/*
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
*/	
	public static void main(String[] args) {
		// 1번 : 1 2 3 4 5  5개
		// 2번 : 2 1 2 3 2 4 2 5  8개
		// 3번 : 3 3 1 1 2 2 4 4 5 5 10개
		int[] answer = {};
		
		
		int[] answers = {1,3,2,4,2};
		int[] score = new int[3];
		int max = 0;
		
		List<Integer> list = new ArrayList<>();
		int [] firstRull = {1,2,3,4,5};
		int [] secondRull = {2,1,2,3,2,4,2,5};
		int [] thirdRull = {3,3,1,1,2,2,4,4,5,5};
		
		
		for(int i = 0; i < answers.length; i ++) {
			if(answers[i] == firstRull[i%5]) score[0]++;
			if(answers[i] == secondRull[i%8]) score[1]++;
			if(answers[i] == thirdRull[i%10]) score[2]++;
		}

		max = Math.max(score[0], Math.max(score[1], score[2]));
		
		//가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
		// 1,2,3 max값
		if(max == score[0]) list.add(1);
		if(max == score[1]) list.add(2);
		if(max == score[2]) list.add(3);
		
		answer = list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public void countAdd(int[] rull, int type) {
		
	}
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	        return answer;
	    }
	}
}
