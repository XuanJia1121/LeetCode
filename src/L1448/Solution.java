package L1448;

/***
 * Medium
 * Count Good Nodes in Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	int count = 0;
	
	public int goodNodes(TreeNode root) {
		if (root == null) return 0;
		preOrder(root,Integer.MIN_VALUE);
		return count;
	}
	
	public void preOrder(TreeNode root,int pre) {
		if (root == null) return;
		if (root.val >= pre) {
			pre = root.val;
			count++;
		}
		preOrder(root.left,pre);
		preOrder(root.right,pre);
	}
	
}
