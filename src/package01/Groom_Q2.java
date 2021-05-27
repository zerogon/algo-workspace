package package01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
			 
			첫 번째 값은 크기값을 가진다
			0과 1과 그 이외 값을 입력받는다
			0인경우 스택에 다음값을 넣는다
			1인경우 스택에 있는 값을 뺀다. 스택이 비어있으면 underflow
			그 외인 경우 종료한다
		 */
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\gon\\Desktop\\개인\\testData\\test01.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\testdata\\test01.txt")));
		
		// 입력값이 0 push , 1 pop , 이외 입력시 프로그램 종료
		// 크기값보다 넘게  push > overflow
		// 비어있는 상태에서 pop > underflow
		int inputLength = Integer.parseInt(br.readLine())*2;
		String inputValue = br.readLine();
		Stack<String> stacks = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		if(inputLength != 0 ) {
			for(int i = 0 ; i < inputLength  ; i ++) {
				// push 인 경우
				if("0".equals(inputValue)) {
					stacks.push(br.readLine());
					// pop 인 경우	
				}else if("1".equals(inputValue)) {
					if(stacks.empty()) {
						sb.append("underflow\n");
					}else {
						stacks.pop();
					}
					// 프로그램 종료	
				}else if(inputValue != null){
					break;
				}
				inputValue = br.readLine();
			}
		}
		
		for(int i =0 ; i < stacks.size(); i++) {
			sb.append(stacks.get(i)+" ");
		}
		if(sb.lastIndexOf("\n") > 0){
			sb.delete(sb.lastIndexOf("\n"), sb.lastIndexOf("\n")+1);
		}
		if(stacks.size() > 10) {
			System.out.println("overflow");
		}else {
		//	System.out.println(sb.toString());
		}
		
		
	}
}
