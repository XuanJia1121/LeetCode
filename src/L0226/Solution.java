package L0226;

import java.util.LinkedList;
import java.util.Queue;

/***
 * EASY
 * Invert Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node == null) continue;
				TreeNode leftTemp = node.left;
				node.left = node.right;
				node.right = leftTemp;
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return root;
	}
	
}
