package L0404;

/***
 * EASY
 * Sum of Left Leaves
 * @author 2008017
 *
 */
public class Solution {
	
	int sum = 0;
	
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) return 0;
		bfs(root,false);
		return sum;
	}
	
	public void bfs(TreeNode root,boolean left) {
		if (root == null) return;
		if (left && root.left == null && root.right == null) {
			sum += root.val;
		}
		bfs(root.left,true);
		bfs(root.right,false);
	}
	
	
}
