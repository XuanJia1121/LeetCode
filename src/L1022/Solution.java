package L1022;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * Sum of Root To Leaf Binary Numbers
 * @author 2008017
 *
 */
public class Solution {
	
	public int sumRootToLeaf(TreeNode root) {
		List<String> list = new ArrayList<>();
		addNumber(root,"",list);
		int i = 0;
		for (String str : list) {
			i += Integer.parseInt(str,2);
		}
		return i;
	}
	
	public void addNumber(TreeNode root,String str,List<String> list) {
		if (root == null) return;
		str = str + root.val;
		if (root.left == null && root.right == null) {
			list.add(str);
			return;
		}
		addNumber(root.left,str,list);
		addNumber(root.right,str,list);
	}

}
