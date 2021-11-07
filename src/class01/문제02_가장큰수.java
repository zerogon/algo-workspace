package class01;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 문제02_가장큰수 {
	public static void main(String[] args) {
		/*
		 * 			[6, 10, 2]	"6210"
				[3, 30, 34, 5, 9]	"9 5 34 3 30"
		 * 
		 */
		
	}
	
	 public static String solution(int[] numbers) {
		 	String answer = IntStream.of(numbers).mapToObj(String::valueOf)
		 			.sorted((s1,s2)->(s2+s1).compareTo(s1+s2))
		 			.collect(Collectors.joining());
		 	if(answer.startsWith("0")) return "0";
		 
	        return answer;
	    }
}
