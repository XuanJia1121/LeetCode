package L0783;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * EASY
 * Minimum Distance Between BST Nodes
 * @author 2008017
 *
 */
public class Solution {
	
	List<Integer> list = new ArrayList<>();
	
	public int minDiffInBST(TreeNode root) {
		int min = Integer.MAX_VALUE;
		dfs(root);
		Collections.sort(list);
		for (int i = 1; i < list.size(); i++) {
			min = Math.min(list.get(i) - list.get(i - 1), min);
		}
		return min;
	}
	
	public void dfs(TreeNode root) {
		if (root == null) return;
		dfs(root.left);
		list.add(root.val);
		dfs(root.right);
	}
	
}
