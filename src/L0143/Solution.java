package L0143;

/***
 * medium
 * Reorder List
 * @author 2008017
 *
 */
public class Solution {
	
	public void reorderList(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode mid = reverse(slow.next);
		slow.next = null;
		ListNode cur = head;
		ListNode next;
		ListNode next2;
		while(mid != null) {
			next = cur.next;
			next2 = mid.next;
			cur.next = mid;
			mid.next = next;
			mid = next2;
			cur = next;
		}
	}
	
	public ListNode reverse(ListNode head) {
		ListNode cur = head;
		ListNode next = null;
		ListNode pre  = null;
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
}
