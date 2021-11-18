package level01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Song06 {
	/*
	"01033334444"	"*******4444"
	"027778888"	"*****8888"
	*/
	public static void main(String[] args) {
		
		String pn = "01033334444";
		int pnLength = pn.length();
		System.out.println(pnLength);
		Stream<String> st = Stream.of(pn);
		st.limit(2).forEach(s->System.out.println(s));
	}
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        return answer;
	    }
	}
}
