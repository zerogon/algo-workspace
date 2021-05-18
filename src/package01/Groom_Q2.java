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

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\gon\\Desktop\\����\\testData\\test01.txt")));
		
		// �Է����� 0 push , 1 pop , �̿� �Է½� ���α׷� ����
		// ũ�Ⱚ���� �Ѱ�  push > overflow
		// ����ִ� ���¿��� pop > underflow
		int inputLength = Integer.parseInt(br.readLine())*2;
		String inputValue = br.readLine();
		Stack<String> stacks = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < inputLength ; i ++) {
			// push �� ���
			if("0".equals(inputValue)) {
				sb.append(br.readLine()+" ");
			// pop �� ���	
			}else if("1".equals(inputValue)) {
				if(stacks.empty()) {
					stacks.push("underflow\n");
				}else {
					stacks.pop();
				}
			// ���α׷� ����	
			}else {
				break;
			}
		}
		
	}
}
