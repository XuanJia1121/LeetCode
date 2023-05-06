package L0002;

/***
 * Medium
 * Add Two Numbers
 * @author 2008017
 *
 */
public class Solution {
	
	int less = 0;
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		if (less == 0 && l1 == null && l2 == null) return null;
		
		int val1 = l1 == null ? 0 : l1.val;
		int val2 = l2 == null ? 0 : l2.val;
		
		l1 = l1 == null ? null : l1.next;
		l2 = l2 == null ? null : l2.next;
		
		int sum = val1 + val2 + less;
		less = sum / 10;
		
		return new ListNode(sum % 10,addTwoNumbers(l1,l2));
	}
	
}
