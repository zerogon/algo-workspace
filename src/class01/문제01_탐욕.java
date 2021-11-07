package class01;

public class 문제01_탐욕 {
	
	/*
	 *          N	stations	    W	answer
				11	[4, 11]	        1	  3
				16	[9]	            2	  3
	 * 
	 */
	//  1 2 3 4 5 6 7 8 9 10 11 
	//        O               O
	//
	
	// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
	//                 O
	public static void main(String[] args) {
		int n = 11;
		int [] stations = {4, 11};
		int w = 1 ;
		System.out.println(solution(n,stations,w));
	}
	
    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int si = 0;
        
        // ť�� ������� �ʴٴ� ���� �ε����� ������ ���� �ʾҴ�.
        while(position <= n) {
        	if(si < stations.length && stations[si]-w <= position ) {
        		position = stations[si] + w + 1; 
        		si += 1;
        	}else {
        		answer ++;
        		position += 2 * w + 1;
        	}
        }
        return answer;
    }
}
