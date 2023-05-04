package L0897;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * Increasing Order Search Tree
 * @author 2008017
 *
 */
public class Soltion {
	
	List<TreeNode> list = new ArrayList<>();
	
	public TreeNode increasingBST(TreeNode root) {
		if (root == null) return null;
		inOrder(root);
		TreeNode node = new TreeNode();
		for (int i = 0; i < list.size(); i++) {
			if(i == 0) {
				node.right = list.get(i);
				root = node.right;
				node = node.right;
			} else {
				node.right = list.get(i);
				node = node.right;
			}
		}
		return root;
	}
	
	
	public void inOrder(TreeNode root) {
		if (root == null) return;
		if (root.left != null) inOrder(root.left);
		list.add(new TreeNode(root.val));
		if (root.right != null) inOrder(root.right);
	}
	
}
