package BinaryTree;

public class BinaryTreeDemo {
	public static void main(String[] args) throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		HeroNode root = new HeroNode(1, "宋江");
		HeroNode node2 = new HeroNode(2, "吳用");
		HeroNode node3 = new HeroNode(3, "盧俊義");
		HeroNode node4 = new HeroNode(4, "林沖");

		root.setLeft(node2);
		root.setRight(node3);
		node3.setRight(node4);
		binaryTree.setRoot(root);

		System.out.println("===前序遍歷===");
		binaryTree.preOrder();
		System.out.println("===中序遍歷===");
		binaryTree.inOrder();
		System.out.println("===後序遍歷===");
		binaryTree.postOrder();
	}
}
