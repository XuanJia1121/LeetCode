package L0429;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/***
 * Medium
 * N-ary Tree Level Order Traversal
 * @author 2008017
 *
 */
public class Solution {
	
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null) return list;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> intList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				Node node = queue.remove();
				intList.add(node.val);
				if (node.children != null && node.children.size() > 0) {
					for (Node no : node.children) {
						queue.add(no);
					}
				}
			}
			list.add(intList);
		}
		return list;
	}
	
}
