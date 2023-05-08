package L1038;

/***
 * Medium
 * Binary Search Tree to Greater Sum Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public TreeNode bstToGst(TreeNode root) {
		if (root != null) dfs(root,0);
		return root;
	}
	
	public int dfs(TreeNode root,int val) {
		if (root.right != null) {
			int value = dfs(root.right,val);
			root.val += value;
		} else {
			root.val += val;
		}
		if (root.left == null) {
			return root.val;
		} else {
			return dfs(root.left,root.val);
		}
	}
	
}
