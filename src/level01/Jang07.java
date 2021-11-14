package level01;

import java.util.Stack;

public class Jang07 {
	/*
	
	1	1S2D*3T	37	11 * 2 + 22 * 2 + 33
	2	1D2S#10S	9	12 + 21 * (-1) + 101
	3	1D2S0T	3	12 + 21 + 03
	4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
	5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
	6	1T2D3D#	-4	13 + 22 + 32 * (-1)
	7	1D2S3T*	59	12 + 21 * 2 + 33 * 2
	 4 16 3 
	 2 8 8
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1T2D3D#";
		// 1*2*2 + 8*2 + 3 = 4+16+3
		int i = 0;
		// 점 보 (옵) 점 보 (옵) 점 보 (옵)
		Stack<Integer> scoreList = new Stack<Integer>();
		while(scoreList.size() < 4 && i != dartResult.length()) {
			char score = dartResult.charAt(i);
			if(Character.isDigit(score)) {
				int intScore = Character.getNumericValue(score);
				char bonus = dartResult.charAt(i+1);
				if(score == '1' && dartResult.charAt(i+1) =='0') {
					intScore = 10;
					bonus = dartResult.charAt(i+2);
					i+=3;
				}else {
					i+=2;
				}
				int calScore = calScorePro(intScore, bonus);
				scoreList.push(calScore);
			}else { // 옵션인 경우 * : 이전과 현재 2배, #: -1
				if('*' == score) {
					//String dartResult = "1S*2T*3S";
					// 4 16 3
					int doubleScore = scoreList.pop()*2;
					if(i!=2) {
						int preScore = scoreList.pop()*2;
						scoreList.push(preScore);
					}
					scoreList.push(doubleScore);
					i+=1;
				}else if('#' == score){
					//String dartResult = "1T2D3D#";
					int calScore = scoreList.pop() * (-1);
					System.out.println("calScore:"+calScore);
					scoreList.push(calScore);
					i+=1;
				}
			}
		}
		//answer = scoreList.pop()+scoreList.pop()+scoreList.pop();
		//System.out.println(answer);
		System.out.println(scoreList.pop());
		System.out.println(scoreList.pop());
		System.out.println(scoreList.pop());
	}
	public static int calScorePro(int score, char bonus) {
		if('S'==bonus) {
			return score;
		}else if('D'==bonus) {
			return score * score;
		}else {
			return score * score * score;
		}
	}
	class Solution {
		public int solution(String dartResult) {
			int answer = 0;
			return answer;
		}
	}
}
