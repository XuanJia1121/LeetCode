package L0404;

import java.util.LinkedList;
import java.util.Queue;

/***
 * EASY
 * Sum of Left Leaves
 * @author 2008017
 *
 */
public class Solution {
	
	int sum = 0;
	
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node.left != null) {
					sum += node.left.val;
					queue.add(node.left);
				} 
				if (node.right != null) {
					queue.add(node.right);
				} 
			}
		}
		return sum;
	}
	
	
}
