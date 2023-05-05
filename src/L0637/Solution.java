package L0637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * EASY
 * Average of Levels in Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(2147483647);
		node.left = new TreeNode(2147483647);
		node.right = new TreeNode(2147483647);
		averageOfLevels(node);
	}
	
	public static List<Double> averageOfLevels(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<Double> list = new ArrayList<>();
		if (root == null) return list;
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			Double sum = 0d;
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (node == null) continue;
				sum += node.val;
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
			list.add(new Double(sum) / size);
		}
		return list;
	}

}
