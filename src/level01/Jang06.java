package level01;

public class Jang06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
		[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
		[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
		*/
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
	
		
		StringBuilder sb = new StringBuilder();
		int left=10, right=12;
		int leftDis, rightDis;
		for(int n : numbers) {
			leftDis = 0; rightDis = 0;
			if(n == 1 || n == 4 || n == 7) {
				sb.append("L");
				left = n;
			}else if(n == 3 || n == 6 || n == 9) {
				sb.append("R");
				right = n;
			}else {
				if(n==0) n += 11;
				leftDis = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
				rightDis = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
				if(leftDis == rightDis) {
					if(hand.equals("right")) {
						sb.append("R");
						right = n;
					}else {
						sb.append("L");
						left = n;
					}
				}else if(leftDis > rightDis) {
					sb.append("R");
					right = n;
				}else {
					sb.append("L");
					left = n;
				}
			}
		}	
		System.out.println(sb.toString());
	}
	
	
	class Solution {
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        return answer;
	    }
	}
}
