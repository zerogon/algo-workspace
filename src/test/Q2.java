package test;

public class Q2 {
	public static void main(String[] args) {
		   Tree t = new Tree();
		   /*
	        Node D = t.createNode(null, 'D', null);
	        Node E = t.createNode(null, 'E', null);
	        Node F = t.createNode(null, 'F', null);
	        Node B = t.createNode(D, 'B', E);
	        Node C = t.createNode(F, 'C', null);
	        Node A = t.createNode(B, 'A', C);
	        */
		   /*
	        String message = "ABCDEF";
	        for(int i = 0 ; i <= input.length() / 2; i ++) {
	        	Node first = t.createNode(null, input.charAt(input.length()-1+i), null);
	        	
	        }
	        */
	        String message = "ABCDEF";
	        char root = message.charAt(0);
			char left = message.charAt(1);
			char right = message.charAt(2);
			
	}
}
/*
class Node {
    char data;
    Node left;
    Node right;
}
class Tree {
    public Node root;
    public void setRoot(Node node) {
        this.root = node;
    }
    public Node getRoot() {
        return root;
    }
    public Node createNode(Node left, char data, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }
    public void postOrder(Node node) {
        if(node != null) {
        	postOrder(node.left);
        	postOrder(node.right);
            System.out.println(node.data);
        }
    }
}
 

*/
