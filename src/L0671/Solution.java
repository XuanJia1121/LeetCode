package L0671;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/***
 * EASY
 * Second Minimum Node In a Binary Tree
 * @author 2008017 
 *
 */
public class Solution {
	
	Integer first = Integer.MAX_VALUE;
	Integer second = Integer.MAX_VALUE;
	boolean hasSecond = false;
	
	public int findSecondMinimumValue_DFS(TreeNode root) {
		if (root == null) return -1;
		DFS(root);
		return hasSecond ? second : -1;
	}
	
	public void DFS(TreeNode root) {
		if (root == null) return;
		if (root.val < first) {
			first = root.val;
		}
		if (root.val > first && root.val <= second) {
			second = root.val;
			hasSecond = true;
		}
		DFS(root.left);
		DFS(root.right);
	}
	
	public int findSecondMinimumValue_Bad(TreeNode root) {
		if (root == null) return -1;
		if (root.left == null && root.right == null) return -1;
		List<Integer> list = new ArrayList<>();
		preOrder(root,list);
		list.sort(Comparator.comparing(Function.identity()));
		if(list.size() == 1) return -1;
		return list.get(1);
	}
	
	public void preOrder(TreeNode root,List<Integer> list) {
		if (root == null) return;
		if (!list.contains(root.val)) list.add(root.val); 
		if (root.left != null) {
			preOrder(root.left,list);
		}
		if (root.right != null) {
			preOrder(root.right,list);
		}
	}
	
}
