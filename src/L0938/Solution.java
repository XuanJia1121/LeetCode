package L0938;

/***
 * EASY
 * Range Sum of BST
 * @author 2008017
 *
 */
public class Solution {
	
	int sum = 0;
	
	public int rangeSumBST(TreeNode root, int low, int high) {
		preOrder(root,low,high);
		return sum;
	}
	
	public void preOrder(TreeNode root, int low, int high) {
		if (root == null) return;
		if (root.val <= high && root.val >= low) {
			sum += root.val;
		}
		if (root.left != null) {
			preOrder(root.left,low,high);
		}
		if (root.right != null) {
			preOrder(root.right,low,high);
		}
	}
	
}
