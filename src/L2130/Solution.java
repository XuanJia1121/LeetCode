package L2130;

import java.util.ArrayList;
import java.util.List;

/***
 * Medium
 * Maximum Twin Sum of a Linked List
 * @author 2008017
 *
 */
public class Solution {
	
	public int pairSum(ListNode head) {
		int max = 0;
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int start = 0;
		int last = list.size() - 1;
		while (last > start) {
			max = Math.max(max,list.get(start++) + list.get(last--));
		}
		return max;
	}
	
}
