package L0203;

/***
 * EASY
 * Remove Linked List Elements
 * @author 2008017
 *
 */
public class Solution {

	public static void main(String[] args) {
		System.out.println(removeElements(new ListNode(1),2));
	}
	
	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) return null;
		ListNode dummy = new ListNode();
		dummy.next = head;
		ListNode cur = dummy;
		while (cur.next != null) {
			if (cur.next.val == val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return dummy.next;
	}
	
}
