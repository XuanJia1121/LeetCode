package L1721;

import java.util.ArrayList;
import java.util.List;

/***
 * Medium
 * Swapping Nodes in a Linked List
 * @author 2008017
 *
 */
public class Solution {
		
	public ListNode swapNodes(ListNode head, int k) {
		if (head == null) return head;
		ListNode cur = head;
		List<ListNode> list = new ArrayList<>();
		while (cur != null) {
			list.add(cur);
			cur = cur.next;
		}
		int f = 0 + k -1;
		int l = list.size() - 1 - k + 1;
		int temp = list.get(f).val;
		list.get(f).val = list.get(l).val;
		list.get(l).val = temp;
		return head;
	}
	
}
