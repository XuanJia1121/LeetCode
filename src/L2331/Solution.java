package L2331;

/**
 * EASY
 * Evaluate Boolean Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
    public boolean evaluateTree(TreeNode root) {
    	if (root.left == null) {
    		if (root.val == 1) return true;
    		if (root.val == 0) return false;
    	}
    	if (root.val == 2) {
    		return evaluateTree(root.left) || evaluateTree(root.right);
    	} else {
    		return evaluateTree(root.left) && evaluateTree(root.right);
    	}
    }
	
}
