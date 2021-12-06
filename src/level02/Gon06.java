package level02;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Gon06 {
	/*
	[2, 1, 3, 2]	2	1
	[1, 1, 9, 1, 1, 1]	0	5
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		int answer = 0;
		Queue<Integer> que = new LinkedList<Integer>();
		for(int a : priorities) {
			que.offer(a);
		}
		
		Arrays.sort(priorities); //우선순위를 비교하기 위해 오름 차순 정렬
        int length = priorities.length-1; //오름차순 한 마지막 요소가 가장 큰 수 
        while(!que.isEmpty()){
            int current = que.poll();

            //우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
            if(current == priorities[length - answer]){
                answer++;
                location--;
                if(location<0){
                    break;
                }
            }else{
                //처음에 que.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
                que.add(current);
                location--; // 1
                if(location<0){
                    location = que.size()-1;
                }
            }
        }
		

	}
	class Solution {
		public int solution(int[] priorities, int location) {
	        int answer = 0;

	        Queue<Integer> que = new LinkedList<>();

	        for(int pri : priorities){
	            que.add(pri);
	        }

	        Arrays.sort(priorities); //우선순위를 비교하기 위해 오름 차순 정렬
	        int length = priorities.length-1; //오름차순 한 마지막 요소가 가장 큰 수 

	        while(!que.isEmpty()){
	            int current = que.poll();

	            //우선순위가 가장 높은 수 == 현재 큐에 담긴 (프린트 순서)가 같으면
	            if(current == priorities[length - answer]){
	                answer++;
	                location--;
	                if(location<0){
	                    break;
	                }
	            }else{
	                //처음에 que.poll을 했던 수를 add 함으로써 맨 뒤로 밀림
	                que.add(current);
	                location--; // 1
	                if(location<0){
	                    location = que.size()-1;
	                }
	            }
	        }
	        return answer;
	    }
	}
}
