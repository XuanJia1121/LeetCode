package L0110;

/***
 * EASY
 * Balanced Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	boolean res = true;
	
	public boolean isBalanced(TreeNode root) {
		maxDp(root);
		return res;
	}
	
	public int maxDp(TreeNode root) {
		if (root == null || !res) return 0;
		int left = maxDp(root.left);
		int right = maxDp(root.right);
		if (Math.abs(right - left) > 1) {
			res = false;
			return 0;
		}
		return Math.max(left, right) + 1;
	}
	
}
