package L0590;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * N-ary Tree Postorder Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<Integer> postorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) return list;
		add(root,list);
		return list;
	}
	
	public void add(Node root,List<Integer> list) {
		if (root == null) return;
		if (root.children != null && root.children.size() > 0) {
			for (Node node : root.children) {
				add(node,list);
			}
		}
		list.add(root.val);
	}
	
	
	
}
