package L0606;

/***
 * EASY
 * Construct String from Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	StringBuilder sb = new StringBuilder();
	
	public String tree2str(TreeNode root) {
		dfs(root);
		return sb.toString();
	}
		
	public void dfs(TreeNode root) {
		if (root == null) return;
		sb.append(root.val);
		if (root.left != null) {
			sb.append("(");
			dfs(root.left);
			sb.append(")");
		}
		if (root.right != null) {
			if (root.left == null) {
				sb.append("()");
			}
			sb.append("(");
			dfs(root.right);
			sb.append(")");
		}
	}
	
	
}
