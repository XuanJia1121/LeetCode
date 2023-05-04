package L0104;

import java.util.LinkedList;
import java.util.Queue;


/***
 * EASY
 * Maximum Depth of Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public int maxDepth(TreeNode root) {
		int maxSize = 0;
		if (root == null) return maxSize;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			boolean all = true;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node == null)
					continue;
				queue.add(node.left);
				queue.add(node.right);
				all = false;
			}
			if (all) break;
			maxSize++;
		}
		return maxSize;
	}
	
}
