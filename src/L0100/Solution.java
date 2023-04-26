package L0100;

/***
 * EASY
 * Same Tree
 * @author 2008017
 *
 */
public class Solution {
	
	boolean rtn = true;
	
	public boolean isSameTreeBest(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true; 
		if (p == null || q == null) return false;
		return (p.val == q.val) && isSameTreeBest(p.left,q.left) && isSameTreeBest(p.right,q.right);
	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		valid(p,q);
		return rtn;
	}
	
	public void valid(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return;
		}  
		if (p == null || q == null) {
			rtn = false;
			return;
		} 
		if(p.val != q.val) {
			rtn = false;
			return;
		}
		valid(p.left,q.left);
		valid(p.right,q.right);
	}
	
}
