package L0094;

import java.util.ArrayList;
import java.util.List;

/***
 * Easy 
 * Binary Tree Inorder Traversal
 * @author 2008017
 *
 */

public class Solution {
	
	List<Integer> arr = new ArrayList<>();
	
	public List<Integer> inorderTraversal(TreeNode root) {
		if (root != null) {
			this.inorderTraversal(root.left);
			arr.add(root.val);
			this.inorderTraversal(root.right);
		}
		return arr;
	}

	public void inOrder(TreeNode root, List<Integer> list) {
		if (root.left != null) {
			this.inOrder(root.left, list);
		}
		list.add(root.val);
		if (root.right != null) {
			this.inOrder(root.right, list);
		}
	}

}
