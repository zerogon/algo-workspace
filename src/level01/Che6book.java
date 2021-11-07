package level01;
import java.util.*;

public class Che6book {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		 int answer = n - lost.length;
	        Arrays.sort(lost);
	        Arrays.sort(reserve);
	        
	        // 여벌 체육복을 가져온 학생이 도난당한 경우
	        //  n = 5 , lost = {2, 4} reverse = {2,4,5} 
	        for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if(lost[i] == reserve[j]){
	                    answer++;
	                    lost[i] = -1;
	                    reserve[j] = -1; 
	                    break; 
	                }
	            }
	        }
	        for(int i : lost) {
	        	System.out.println(i);
	        }
	        System.out.println("====");
	        for(int i : reserve) {
	        	System.out.println(i);
	        }
	        System.out.println("====");
	        // 도난당한 학생에게 체육복 빌려주는 경우
	        for(int i=0; i<lost.length; i++){
	            for(int j=0; j<reserve.length; j++){
	                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
	                    answer++;
	                    System.out.println(reserve[j]);
	                    reserve[j] = -1; 
	                    break; 
	                }
	            }
	        }
	}
}
