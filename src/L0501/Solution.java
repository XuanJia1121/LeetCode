package L0501;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * EASY
 * Find Mode in Binary Search Tree
 * @author 2008017
 *
 */
public class Solution {
	
	static Map<Integer,Integer> map = new HashMap<>();
	
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		node.right = node2;
		node2.left = new TreeNode(2);
		findMode(node);
	}
	
	public static int[] findMode(TreeNode root) {
		dfs(root);
		int max = Integer.MIN_VALUE;
		for(int key : map.keySet()) {
			int count = map.get(key);
			if (count > max) {
				list.clear();
				list.add(key);
				max = count;
			} else if (count == max) {
				list.add(key);
			}
		}
		int[] array = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	
	public static void dfs(TreeNode root) {
		if (root == null) return;
		if (map.containsKey(root.val)) {
			map.put(root.val, map.get(root.val) + 1);
		} else {
			map.put(root.val, 1);
		}
		dfs(root.left);
		dfs(root.right);
	}
	
}
