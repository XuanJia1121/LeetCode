package L0111;

/***
 * EASY
 * Minimum Depth of Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l == 0 || r == 0) {
            return l + r + 1;
        } else {
            return Math.min(l, r) + 1;
        }
    }
	
}
