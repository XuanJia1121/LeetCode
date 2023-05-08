package L2265;

/***
 * Medium
 * Count Nodes Equal to Average of Subtree
 * @author 2008017
 *
 */
public class Solution {
	
	int count = 0;
	
	public int averageOfSubtree(TreeNode root) {
		if (root == null) return 0;
		dfs(root);
		return count;
	}
	
	public int[] dfs(TreeNode root) {
		if (root == null) return new int[] {0,0};
		int[] left = dfs(root.left);
		int[] right = dfs(root.right);
		int sum = left[0] + right[0] + root.val;
		int leaf = left[1] + right[1] + 1;
		if (sum / leaf == root.val) {
			count++;
		}
		return new int[] {sum,leaf};
	}
	
}
