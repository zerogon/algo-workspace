package notebook;

public class Line01 {

	/*
	[0, 1, 2, 5, 3, 7]	            3  [0, 1, 2, 5, 3], [1, 2, 5, 3], [2, 5, 3],
	[1, 2, 3, 2, 1]             	4  [1, 2, 3, 2], [2, 3, 2] [1, 2, 3, 2, 1],, [2, 3, 2, 1]
	[1, 2, 3, 2, 1, 4, 3, 2, 2, 1]	6  [1, 2, 3, 2], [1, 2, 3, 2, 1], [2, 3, 2], [2, 3, 2, 1], [1, 4, 3], [1, 4, 3, 2
	[1, 2, 1, 2, 1]	                2
	*/
	/*
	[0, 1, 2, 5*, 3, 7]					3  = 3X1
	[1, 2, 3*, 2, 1]					4  = 2X2
	[1, 2, 3*, 2, 1, 4*, 3, 2, 2, 1]	6  = 2X2 + 1X2  
	[1, 2, 1, 2, 1]						2  = 1X1 + 1X1  
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {0, 1, 2, 5, 3, 7};
	//int[] arr = {1, 2, 3, 2, 1, 4, 3, 2, 2, 1};
		int[] arr = {1, 2, 3, 2, 1};
		int leftCount = 0;
		int rightCount = 0;
		boolean isUp = false;
		for(int i = 0 ; i < arr.length-1; i++) {
			if(arr[i]<arr[i+1]) {
				leftCount++;
			}else if(arr[i]>arr[i+1]){
				for(int j = i ; j < arr.length-1 ; j++) {
					if(arr[j]>arr[j+1]) {
						rightCount++;
					}else {
						break;
					}
					//System.out.println(leftCount);
					System.out.println(rightCount);
				}
				continue;
			}
		}
		
//	System.out.println(sum);
	}
	class Solution {
	    public int solution(int[] arr) {
	        int answer = 0;
	        return answer;
	    }
	}
}
