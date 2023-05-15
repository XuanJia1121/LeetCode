package L0993;

import java.util.LinkedList;
import java.util.Queue;

/***
 * EASY
 * Cousins in Binary Tree
 * @author 2008017
 *
 */
public class Solution {
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(4);
		node.left = new TreeNode(5);
		node.right = new TreeNode(6);
		System.out.println(isCousins(node,5,6));
	}
	
	public static boolean isCousins(TreeNode root, int x, int y) {
		Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return false;
        queue.add(root);
        int depthY = -1;
        int depthX = -2;
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode node = queue.remove();
                if(node.left != null && node.right != null){
                    if(node.left.val == x && node.right.val == y) return false;
                    if(node.left.val == y && node.right.val == x) return false;
                }
                if(node.val == x) depthX = level;
                if(node.val == y) depthY = level;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return depthX == depthY;
	}
	
	
	
}
