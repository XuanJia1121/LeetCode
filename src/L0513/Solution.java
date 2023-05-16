package L0513;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Medium
 * Find Bottom Left Tree Value
 * @author 2008017
 *
 */
public class Solution {
	
	public int findBottomLeftValue(TreeNode root) {
		int maxLeft = Integer.MIN_VALUE;
		if (root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (i == 0) maxLeft = node.val;
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		return maxLeft;
	}
	
}
