package level01;

import java.util.Arrays;

public class KIM01 {
	public static void main(String[] args) {
        String[] answer = new String[5]; 
        int [] arr1	= {46, 33, 33 ,22, 31, 50};
        int [] arr2	= {27 ,56, 19, 14, 14, 10};
        for(int i =0;i<5;i++){
            // 1. arr1과 arr2의 원소들을 이진수로 바꾼 뒤, or 비트 논리연산 수행.
            String str=Integer.toBinaryString(arr1[i] | arr2[i]);
            // 2. 5자리의 문자열 형태로 포맷변경, 5자리가 안되는 이진수의 나머지는 공백으로 채운다.
            str = String.format("%"+5+"s",str);
            System.out.println(str);
            // 3. 1->#, 0 -> 공백 으로 바꾼다.
            str = str.replaceAll("1" , "#");
            str = str.replaceAll("0" , " ");
            // 4. 한 줄 완성.
            answer[i] = str;
        }
	}
}

//[46, 33, 33 ,22, 31, 50]
//arr2	[27 ,56, 19, 14, 14, 10]
class Solution {
	public int solution(int[] d, int budget) {
		Arrays.sort(d);
		int answer = 0;
		int sum = 0;
		for(int i = 0 ; i < d.length; i++) {
			sum += d[i];
			if(sum <= budget) {
				answer ++;
			}else {
				return i ;
			}
		}
		return answer;
	}
}

