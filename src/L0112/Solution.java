package L0112;

/***
 * EASY
 * Path Sum
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean hasPathSum(TreeNode root, int targetSum) {
		return valid(root,targetSum,0);
	}
	
	public boolean valid(TreeNode root, int targetSum,int val) {
		if (root == null) return false;
		val += root.val;
		if (root .left == null && root.right == null) return targetSum == val;
		return valid(root.left,targetSum,val) || valid(root.right,targetSum,val);
	}
	
}
