package L0144;

import java.util.ArrayList;
import java.util.List;


/***
 * EASY
 * Binary Tree Preorder Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		dfs(root,list);
		return list;
	}
	
	public void dfs(TreeNode root,List<Integer> list) {
		if (root == null) return;
		list.add(root.val);
		dfs(root.left,list);
		dfs(root.right,list);
	}
	
}
