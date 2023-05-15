package L1161;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Medium
 * Maximum Level Sum of a Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	int maxSum = Integer.MIN_VALUE;
	int level = 0;
	int rtnLeval = 0;
	
	public int maxLevelSum(TreeNode root) {
		if (root == null) return rtnLeval;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			level++;
			int size = queue.size();
			int sum = 0;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				sum += node.val;
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			if (sum > maxSum) {
				maxSum = sum;
				rtnLeval = level;
			}
		}
		return rtnLeval;
	}
	
}
