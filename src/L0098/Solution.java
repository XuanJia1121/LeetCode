package L0098;

import java.util.ArrayList;
import java.util.List;

/***
 * Medium
 * Validate Binary Search Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean isValidBST(TreeNode root) {
		if (root == null) return false;
		List<Integer> list = new ArrayList<Integer>();
		inOrder(root,list);
		int pre = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) <= pre) {
				return false;
			}
			pre = list.get(i);
		}
		return true;
    }
	
	public void inOrder(TreeNode root,List<Integer> list) {
		if (root == null) return;
		if (root.left != null) {
			inOrder(root.left,list);
		} 
		list.add(root.val);
		if (root.right != null) {
			inOrder(root.right,list);
		}
	}
	
	
}
