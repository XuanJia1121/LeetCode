package L1609;

import java.util.LinkedList;
import java.util.Queue;

/***
 * Medium
 * Even Odd Tree
 * @author 2008017
 *
 */
public class Solution {
	
	static int even = Integer.MIN_VALUE;
	static int odd = Integer.MIN_VALUE;
	
	
//	public static void main(String[] args) {
//		TreeNode node1 = new TreeNode(1);
//		TreeNode node10 = new TreeNode(10);
//		TreeNode node4 = new TreeNode(4);
//		TreeNode node3 = new TreeNode(3);
//		TreeNode node7 = new TreeNode(7);
//		TreeNode node9 = new TreeNode(9);
//		TreeNode node12 = new TreeNode(12);
//		TreeNode node8 = new TreeNode(8);
//		TreeNode node6 = new TreeNode(6);
//		TreeNode node2 = new TreeNode(2);
//		node1.left = node10;
//		node1.right = node4;
//		node10.left = node3;
//		node3.left = node12;
//		node3.right = node8;
//		node4.left = node7;
//		node4.right = node9;
//		node9.right = node2;
//		node7.left = node6;
//		System.out.println(isEvenOddTree(node1));
//	}
	
	public boolean isEvenOddTree(TreeNode root) {
		if (root == null) return false;
		int leval = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size=  queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.remove();
				if (i == 0) {
					even = Integer.MAX_VALUE;
					odd = Integer.MIN_VALUE;
				}
				if (!valid(leval,node.val)) return false;
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			leval++;
		}
		return true;
	}
	
	public boolean valid(int level,int val) {
		if (level % 2 == 0) {
			if (val <= odd) return false;
			odd = val;
			if (val % 2 == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			if (val >= even) return false;
			even = val;
			if (val % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}
