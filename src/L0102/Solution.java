package L0102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * Medium
 * Binary Tree Level Order Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null) return list;
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> intList = new ArrayList<>();
			int size = queue.size();
			for (int i = 1;i <= size;i++) {
				TreeNode node = queue.remove();
				intList.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			list.add(intList);
		}
		return list;
	}
	
}
