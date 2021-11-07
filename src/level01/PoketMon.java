package level01;

import java.util.HashSet;
import java.util.Set;

public class PoketMon {

	public static void main(String[] args) {
		
		

	}

}
class Test {
    public int solution(int[] nums) {
        int answer = 0;
        //1. 가져가는 포켓몬 수, nums의 절반크기 구하기. 
        //2. 정수배열의 중복제거한 크기구하기.
        //3. 1),2) 비교하여 answer 구하기.
        int halfValue = nums.length / 2 ;
        Set<Integer> st = new HashSet<Integer>();
        for(int a : nums) {
        	st.add(a);
        }
        int targetValue = st.size();
        answer = halfValue > targetValue ?  targetValue : halfValue;
        
        return answer;
    }
}

