package L0876;

/***
 * EASY
 * Middle of the Linked List
 * @author 2008017
 *
 */
public class Solution {
	
	//暴力解
	public ListNode middleNode(ListNode head) {
		if (head == null)
			return null;
		int size = 0;
		ListNode dummy = head;
		while (dummy != null) {
			size++;
			dummy = dummy.next;
		}
		ListNode cur = new ListNode();
		cur.next = head;
		for (int i = 0; i <= size / 2; i++) {
			cur = cur.next;
		}
		return cur;
	}
	
	//Fast & Slow Pointer
	public ListNode middleNode2(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
}
