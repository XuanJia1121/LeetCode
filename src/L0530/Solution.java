package L0530;

/***
 * EASY
 * Minimum Absolute Difference in BST
 * @author 2008017
 *
 */
public class Solution {
	
	int min = Integer.MAX_VALUE;
	TreeNode pre = null;

	public int getMinimumDifference(TreeNode root) {
		if (root == null) return 0;
		dfs(root);
		return min;
	}
	
	public void dfs(TreeNode root) {
		if (root == null) return;
		dfs(root.left);
		if (pre != null) min = Math.min(min,root.val - pre.val);
		pre = root;
		dfs(root.right);
	}
	
}
