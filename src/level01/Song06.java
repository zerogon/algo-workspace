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
		
		String phone_number = "027778888";
		
		StringBuilder sb  = new StringBuilder();
		
		for(int i = 0 ; i < phone_number.length(); i++) {
			if(i<phone_number.length()-4) {
				sb.append("*");
				continue;
			}
			sb.append(phone_number.charAt(i));
		}
		System.out.println(sb.toString());
		
	}
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        return answer;
	    }
	}
}
