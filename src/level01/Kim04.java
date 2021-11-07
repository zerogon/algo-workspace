package level01;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kim04 {
	/*
	[[60, 50], [30, 70], [60, 30], [80, 40]]	4000   80 50
	[[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120  8 15 
	[[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133  7 19
	*/
	/*
	[[60, 50], [70, 30], [60, 30], [80, 40]]	4000   80 50
	[[7, 10], [3, 12], [8, 15], [7, 14], [5, 15]]	120  8 15 
	[[14, 4], [19, 6], [16, 6], [18, 7], [11, 7]]	133  7 19
	 */
	public static void main(String[] args) {
		// 80 40, 50 70 30 40*  80과 40 사이 -> 40 50 70 
		// 8 15 , 10 12 8* 14 5 15와 8사이 -> 8 10 12 14  
		// 19 7 , 4 6 16 7* 11
		
		int[][] sizes = {{60, 50}, {70, 30}, {60, 30}, {80, 40}};
		// 50,60   30,70  30,60  40,80
		
		Stream.of(sizes).sorted();
		
		for(int[] targetList : sizes) {
			Arrays.sort(targetList);
		}
		
		int lmax = 0, rmax = 0;
		for(int[] targetList : sizes) {
			for(int i = 0; i < targetList.length; i ++) {
				lmax = lmax < targetList[0] ? targetList[0] : lmax;
				rmax = rmax < targetList[1] ? targetList[1] : rmax;
			}
		}
		System.out.println(lmax*rmax);
		
		/*
		for(int[] targetList : sizes) {
			for(int targetNum : targetList) {
				System.out.print(targetNum+",");
			}
		}
		*/
		
		
		
		
		
	}
	class Solution {
	    public int solution(int[][] sizes) {
	        int answer = 0;
	        
	        
	        return answer;
	    }
	}
}
