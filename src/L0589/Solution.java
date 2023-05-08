package L0589;

import java.util.ArrayList;
import java.util.List;

import L0590.Node;

/***
 * EASY
 * N-ary Tree Preorder Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		add(root,list);
		return list;
	}
	
	public void add(Node root,List<Integer> list) {
		if (root == null) return;
		list.add(root.val);
		if (root.children != null && root.children.size() > 0) {
			for (Node node : root.children) {
				add(node,list);
			}
		}
	}
	
	
}
