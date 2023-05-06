package L0965;

import java.util.LinkedList;
import java.util.Queue;

/***
 * EASY
 * Univalued Binary Tree
 * @author xuan
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(2);
		TreeNode node4 = new TreeNode(2);
		TreeNode node5 = new TreeNode(2);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		System.out.println(isUnivalTreeRe(node1));
	}
	
	
	public static boolean isUnivalTree(TreeNode root) {
		if (root == null) return false;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node == null) continue;
				if (node.left != null || node.right != null) {
					if (node.left != null && node.left.val != node.val) return false;
					if (node.right != null && node.right.val != node.val) return false;
				}
				queue.add(node.left);
				queue.add(node.right);
			}
		}
		return true;
	}
	
	public static boolean isUnivalTreeRe(TreeNode root) {
		if (root == null) return true;
		if (root.left != null && root.left.val != root.val) return false;
		if (root.right != null && root.right.val != root.val) return false;
		if (!isUnivalTreeRe(root.left)) return false;
		if (!isUnivalTreeRe(root.right)) return false;
		return true;
	}
	
	
}
