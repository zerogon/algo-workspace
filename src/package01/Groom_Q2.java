package package01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Groom_Q2 {
	public static void main(String[] args) throws IOException {
		/*
			3
			0
			10
			0
			20
			0
			30
			> 10 20 30 
			
			6
			1
			1
			1
			2
			>underflow
			 underflow
			 underflow
			 
			3
			0
			7
			2 
			>7 
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\gon\\Desktop\\개인\\testData\\test01.txt")));
		
		// 입려값이 0 push , 1 pop , 이외 입력시 프로그램 종료
		// 크기값보다 넘게  push > overflow
		// 비어있는 상태에서 pop > underflow
		int inputLength = Integer.parseInt(br.readLine())*2;
		String inputValue = br.readLine();
		Stack<String> stacks = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < inputLength ; i ++) {
			// push 인 경우
			if("0".equals(inputValue)) {
				sb.append(br.readLine()+" ");
			// pop 인 경우	
			}else if("1".equals(inputValue)) {
				if(stacks.empty()) {
					stacks.push("underflow\n");
				}else {
					stacks.pop();
				}
			// 프로그램 종료	
			}else {
				break;
			}
		}
		
	}
}
