package package01;
import java.io.IOException;

public class Groom_Q1 {
	public static void main(String[] args) throws IOException {
		String input = "10";
		int input_int = Integer.parseInt(input);
		StringBuilder answer = new StringBuilder();
		
		
		for(int i = 1 ; i <= input_int; i ++) {
			if(input_int % i == 0) {
				answer.append(i).append(" ");
			}
		}
		System.out.println(answer.toString());
	}
	
}
