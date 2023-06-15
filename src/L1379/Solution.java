package L1379;

/**
 * EASY
 * Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * @author 2008017
 *
 */
public class Solution {
	
	TreeNode rtn = new TreeNode(0);
	
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
		dfs(cloned,target);
		return rtn;
	}
	
	public void dfs(TreeNode cloned,TreeNode target) {
		if (cloned == null) return;
		if (cloned.val == target.val) {
			rtn = cloned;
		}
		dfs(cloned.left,target);
		dfs(cloned.right,target);
	}
	
}
