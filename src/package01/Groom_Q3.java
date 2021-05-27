package package01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Groom_Q3 {
	public static void main(String[] args) throws IOException {
		/*
		  5
			a b c d e             
			f g h i j
			k l m n o
			p q r s t
			u v w x y
			
			0 5 / 0 0
			1 5 / 0 1
			2 5 / 0 2
			3 5 / 0 3
			4 5 / 0 4
			
			0 4 / 1 0 
			1 4 / 1 1
			2 4 / 1 2
			3 4 / 1 3
			4 4 / 1 4
			 
			ejoty dinsx chmrw bglqv afkpu
			ejoty dinsx chmrw bglqv afkpu
			2
			가 세
			로 로
			
			세로가로
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\testdata\\test01.txt")));
		String firstInputValue = br.readLine();
		int inputSize = Integer.parseInt(firstInputValue);
		ArrayList<ArrayList<String>> loadArrays = new ArrayList<ArrayList<String>>(); 
		StringBuilder answer = new StringBuilder();
		
		// 크기만큼의 리스트 생성
		for(int i = 0 ; i < inputSize ; i++) {
			ArrayList<String> ar = new ArrayList<String>();
			loadArrays.add(ar);
		}
		
		// 스페이스 구분값 기준으로 add
		for(int i = 0 ; i < inputSize ; i++) {
			String lineInput = br.readLine();
			String[] inputSplit = lineInput.split(" "); // {"a","b",...}
				for(int j = 0; j < inputSize ; j++) {
					loadArrays.get(j).add(inputSplit[j]);
				}
		}
		
		// 출력은 역순으로
		for(int i = 0 ; i < inputSize ; i++) {
			for(int j = 0 ; j < inputSize ; j++) {
				answer.append(loadArrays.get(inputSize-i-1).get(j));
			}
		}
		
		System.out.println(answer.toString());
		
	}
}
