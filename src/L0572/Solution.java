package L0572;


/***
 * EASY
 * Subtree of Another Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null || subRoot == root) return false;
		if (isSameTreeBest(root,subRoot)) return true;
		return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
	}
	
	public boolean isSameTreeBest(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true; 
		if (p == null || q == null) return false;
		return (p.val == q.val) && isSameTreeBest(p.left,q.left) && isSameTreeBest(p.right,q.right);
	}
	
}
