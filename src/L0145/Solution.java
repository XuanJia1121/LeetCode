package L0145;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * Binary Tree Postorder Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		dfs(root,list);
		return list;
	}
	
	public void dfs(TreeNode root,List<Integer> list) {
		if (root == null) return;
		dfs(root.left,list);
		dfs(root.right,list);
		list.add(root.val);
	}
	
}
