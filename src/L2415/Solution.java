package L2415;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * Medium
 * Reverse Odd Levels of Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public TreeNode reverseOddLevels(TreeNode root) {
		if (root == null) return root;
		int level = 1;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<TreeNode> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node.left != null && node.right != null) {
					queue.add(node.left);
					queue.add(node.right);
					list.add(node.left);
					list.add(node.right);
				}
			}
			if ((level + 1) % 2 == 0) {
				int first = 0;
				int last = list.size() - 1;
				while (last > first) {
					int val = list.get(first).val;
					list.get(first++).val = list.get(last).val;
					list.get(last--).val = val;
				}
			}
			level++;
		}
		return root;
	}
	
}
