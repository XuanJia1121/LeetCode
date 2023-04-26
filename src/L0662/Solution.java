package L0662;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Midium
 * Maximum Width of Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0 ;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int maxSize = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
        	List<TreeNode> list = new ArrayList<>();
        	int qsize = queue.size();
        	int allNull = 0;
        	for (int i = 0;i < qsize;i++) {
        		TreeNode node = queue.remove();
        		list.add(node);
        		if (node != null) {
        			queue.add(node.left);
        			queue.add(node.right);
        			if (node.left != null) {
        				allNull++;
        			}
        			if (node.right != null) {
        				allNull++;
        			}
        		} else {
        			queue.add(null);
        			queue.add(null);
        		}
        	}
        	int start = 0;
        	int end = list.size() -1;
        	while (list.get(start) == null || list.get(end) == null) {
        		if (list.get(start) == null) {
        			start++;
        		}
        		if (list.get(end) == null ) {
        			end--;
        		}
        	}
        	maxSize = Math.max(maxSize, end+1-start);
        	if (allNull < 2) break; 
        }
        return maxSize;
    }
	
}
