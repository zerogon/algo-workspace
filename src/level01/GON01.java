package level01;

public class GON01 {
	public static void main(String[] args) {
		//"try hello world"	"Try  HeLlO   WoRlD"
		//                   0 2  4 6 8 10 12 14
		//                   0  3 5 7   9 10 12   
		String s  = "tr";
		//공백기준으로 단어 자르기
		String[] words = s.split(" ",-1);
		for(int i = 0 ; i < words.length; i ++) {
			// 단어별로 index가 짝수부분은 대문자, 홀수부분은 소문자
			for(int j = 0 ; j < words[i].length(); j++) {
				char[] charArr = words[i].toCharArray();
				if(j%2==0) {
					charArr[j] = Character.toUpperCase(words[i].charAt(j));
				}else {
					charArr[j] = Character.toLowerCase(words[i].charAt(j));
				}
				words[i] = String.valueOf(charArr);
			}
		}
		//자른 단어연결
		String answer = String.join(" ", words);
		
		
		String[] sSplit = s.split("");
		int idx = 0;
		for(int i = 0 ; i < sSplit.length ; i ++) {
			if(sSplit[i].equals(" ")) {
				idx = 0;
			}else if (idx%2==0) {
				sSplit[i] = sSplit[i].toUpperCase();
				idx ++;
			}else {
				sSplit[i] = sSplit[i].toLowerCase();
				idx ++;
			}
			answer += sSplit[i];
		}
		
	}
}
