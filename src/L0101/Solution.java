package L0101;

/***
 * EASY
 * Symmetric Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean isSymmetric(TreeNode root) {
		if (root == null) return false;
		return method(root.left,root.right);
	}
	
	public boolean method(TreeNode l,TreeNode r) {
		if (l == null && r == null) return true;
		if (l == null || r == null) return false;
		return (l.val == r.val) && method(l.left,r.right) && method(l.right,r.left);
	}
	
}
