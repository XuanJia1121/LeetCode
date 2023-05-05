package L0559;

import java.util.LinkedList;
import java.util.Queue;


/***
 * EASY
 * Maximum Depth of N-ary Tree
 * @author 2008017
 *
 */
public class Solution {

	public int maxDepth(Node root) {
		int level = 0;
		if(root == null) return level;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		level++;
		while (!queue.isEmpty()) {
			int size = queue.size();
			boolean hasN = false;
			for (int i = 0; i < size; i++) {
				Node node = queue.remove();
				if (node.children != null && node.children.size() > 0) {
					for (Node n : node.children) {
						queue.add(n);
					}
					hasN = true;
				}
			}
			if (hasN) 
				level++;
			else
				break;
		}
		return level;
	}
	
	public int maxDepth2(Node root) {
		if (root == null)
			return 0;
		int max = 0;
		for (Node c : root.children) {
			max = Math.max(max, maxDepth(c));
		}
		return 1 + max;
	}

}
