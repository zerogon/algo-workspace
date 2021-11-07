package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Tree t = new Tree();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            t.createNode(root, left, right);
        }

        t.postOrder(t.root);

        br.close();
        */
		Solution s1 = new Solution();
		String answer = s1.solution("ABCDEF");
		System.out.println(answer);
	}
}


class Solution {
	public String solution(String message ) {
		String answer = "";
		Tree t = new Tree();
		
		
		for(int i = 0 ; i <= message.length() / 2 ; i ++) {
			char root = message.charAt(i);
			char left = message.charAt(i+1);
			char right = message.charAt(i+2);
			//t.createNode(root, left, right,message.length() / 2, i);
		}
		
		
		return answer;
	}
}
/*
class Node{
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
    }
}


class Tree {
    public Node root;

    public void createNode(char data, char leftData, char rightData, int siz, int a) {
        if(root == null) {
            root = new Node(data);
            root.left = siz != a ? new Node(leftData) : null;
            root.right = siz != a ? new Node(rightData) : null;
        }else {
            searchNode(root, data, leftData, rightData);
        }
    }

    public void searchNode(Node node, char data, char leftData, char rightData) {
        if(node == null) {
            return;
        }else if(node.data == data) {
            node.left = leftData != '.' ? new Node(leftData) : null;
            node.right = rightData != '.' ? new Node(rightData) : null;
        }else {
            searchNode(node.left, data, leftData, rightData);  // 오른쪽 재귀 탐색
            searchNode(node.right, data, leftData, rightData);  // 왼쪽 재귀 탐색
        }
    }


    // 후위순회 Postorder : Left -> Right -> Root
    public void postOrder(Node node) {
        if(node != null) {
            if(node.left != null) {postOrder(node.left);}
            if(node.right != null) {postOrder(node.right);}
            System.out.print(node.data);
        }
    }
}
*/