package L1302;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Medium
 * Deepest Leaves Sum
 * @author 2008017
 *
 */
public class Solution {
	
	int sum = 0;
	int maxLevel = 0;
	
	public int deepestLeavesSum(TreeNode root) {
		if (root == null) return 0;
		int lastLeave = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			int sum = 0;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();	
				sum += node.val;
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			lastLeave = sum;
		}
		return lastLeave;
	}
	
	public void re(TreeNode root,int level) {
		
		if (root == null) return;
		
		if (level > maxLevel) {
			sum = 0;
			maxLevel = level;
		}
		
		if (level == maxLevel) {
			sum += root.val;
		}
		
		re(root.left,level+1);
		re(root.right,level+1);
		
	}
	
}
