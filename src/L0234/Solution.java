package L0234;

import java.util.ArrayList;
import java.util.List;

/***
 * EASY
 * Palindrome Linked List
 * @author 2008017
 *
 */
public class Solution {
	
	public boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int start = 0;
		int end = list.size() - 1;
		while (end > start) {
			if (list.get(start++) != list.get(end--)) return false;
		}
		return true;
	}
	
}
