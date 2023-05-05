package L0002;

/***
 * Medium
 * Add Two Numbers
 * @author 2008017
 *
 */
public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
	}
	
	public void merge(ListNode l1, ListNode l2) {
		int sum = 0;
		int less = 0;
		if (l1 != null || l2 != null) {
			if (l1 != null) {
				sum += l1.val;
			}
			if (l2 != null) {
				sum += l2.val;
			}
			l1.val = sum / 10;
			less = sum % 10;
		}
		return;
	}
	
}
