package L0206;

/***
 * EASY
 * Reverse Linked List
 * @author 2008017
 *
 */
public class Solution {
	
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode cur = head;
		ListNode next = null;
		ListNode pre = null;
		while (cur!= null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	public ListNode reverseListRe(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode temp = reverseListRe(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}
	
}
