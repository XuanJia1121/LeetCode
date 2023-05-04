package L0617;

/***
 * EASY
 * Merge Two Binary Trees
 * @author 2008017
 *
 */
public class Solution {
	
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) return null;
		TreeNode node = new TreeNode();
		int sum = 0;
		if (root1 != null) sum += root1.val;
		if (root2 != null) sum += root2.val;
		node.val = sum;
		node.left = mergeTrees(root1 == null ? null : root1.left,root2 == null ? null : root2.left);
		node.right = mergeTrees(root1 == null ? null : root1.right,root2 == null ? null : root2.right);
		return node;
	}
	
	public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
		if (root1 == null) return root2;
		if (root2 == null) return root1;
		int v1 = root1.val;
		int v2 = root2.val;
		TreeNode node = new TreeNode(v1 + v2);
		node.left = mergeTrees2(root1.left,root2.left);
		node.right = mergeTrees2(root1.right,root2.right);
		return node;
	}
	
}
