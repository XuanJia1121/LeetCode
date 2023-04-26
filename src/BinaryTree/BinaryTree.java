package BinaryTree;

public class BinaryTree {

	private HeroNode root;

	public void setRoot(HeroNode root) {
		this.root = root;
	}

	public void preOrder() {
		if (this.root != null) {
			this.root.preOrder();
		} else {
			System.out.println("二元樹為空");
		}
	}

	public void inOrder() {
		if (this.root != null) {
			this.root.inOrder();
		} else {
			System.out.println("二元樹為空");
		}
	}

	public void postOrder() {
		if (this.root != null) {
			this.root.postOrder();
		} else {
			System.out.println("二元樹為空");
		}
	}

}
