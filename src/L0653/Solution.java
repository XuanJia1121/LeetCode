package L0653;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/***
 * EASY
 * Two Sum IV - Input is a BST
 * @author 2008017
 *
 */
public class Solution {
	
	static Map<Integer,Integer> map = new HashMap<>();
	Set<Integer> set = new HashSet<>();
	
	public static void main(String[] args) {
		TreeNode t5 = new TreeNode(5);
		TreeNode t3 = new TreeNode(3);
		TreeNode t6 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t4 = new TreeNode(4);
		TreeNode t7 = new TreeNode(7);
		t5.left = t3;
		t5.right = t6;
		t3.left = t2;
		t3.right = t4;
		t6.right = t7;
		System.out.println(findTarget(t5,9));
	}
	
	public static boolean findTarget(TreeNode root, int k) {
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		preOrder(root,list,k);
		return list.get(0);
	}
	
	public boolean findTargetRe(TreeNode root, int k) {
		if (root == null ) return false;
		if (set.contains(root.val-k)) {
			return true;
		} else {
			set.add(root.val);
		}
		if (findTargetRe(root.left,k)) return true;
		if (findTargetRe(root.right,k)) return true;
		return false;
	}
	
	
	public static void preOrder(TreeNode root,List<Boolean> b,int k) {
		if (root == null) return;
		if (map.containsKey(k - root.val)) {
			b.set(0,true);
			return;
		} else {
			map.put(root.val, root.val);
		}
		if (root.left != null) {
			preOrder(root.left,b,k);
		}
		if (root.right != null) {
			preOrder(root.right,b,k);
		}
	}
	
}
