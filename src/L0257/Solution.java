package L0257;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * Binary Tree Paths
 * @author 2008017
 *
 */
public class Solution {
	
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<>();
		addToList(root,"",list);
		return list;
	}
	
	public void addToList(TreeNode root,String str,List<String> list) {
		if (root == null) return;
		str = str + root.val;
		if (root.left == null && root.right == null) {
			list.add(str);
			return;
		}
		addToList(root.left,str + "->",list);
		addToList(root.right,str + "->",list);
	}
	
}
