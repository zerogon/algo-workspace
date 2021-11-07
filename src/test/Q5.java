package test;

public class Q5 {
	public static void main(String[] args) {
		Tree tree = new Tree();
		

		tree.addNode(24);

		tree.addNode(15);

		tree.addNode(19);

		tree.addNode(2);

		tree.addNode(28);

		tree.addNode(27);

		tree.addNode(30);



	}
}
 class Tree {

	public Node root;

	

	public void addNode(int value) {

		if (root == null) {

			Node node = new Node();

			node.setValue(value);

			root = node; // root에 값이 없으면, root에 값을 넣는다.

		} else {

                        // root가 존재할 경우, root 변경하기 위한 메소드 호출

			addNode(value, root); 

		}

	}

	

	public void addNode(int value, Node root) {

		if (value <= root.getValue()) {

			if (root.getLeft() == null) {

				Node node = new Node();

				node.setValue(value);

				root.setLeft(node);

			} else {

				addNode(value, root.getLeft());

			}

		} else {

			if (root.getRight() == null) {

				Node node = new Node();

				node.setValue(value);

				root.setRight(node);

			} else {

				addNode(value, root.getRight());

			}

		}

	}

}



 class Node {

	private int value; 

	private Node left;

	private Node right;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	


}



