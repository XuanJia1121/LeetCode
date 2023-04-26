package L0021;

/***
 * EASY
 * Merge Two Sorted Lists
 * @author 2008017
 *
 */
public class Solution {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode listNode = new ListNode(0);
		ListNode cur = listNode;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				cur.next =  list1;
				list1 = list1.next;
			} else {
				cur.next =  list2;
				list2 = list2.next;
			}
			cur = cur.next;
		}
		if (list1 == null) {
			cur.next = list2;
		} 
		if (list2 == null) {
			cur.next = list1;
		} 
		return listNode.next;
	}
	
	public ListNode mergeTwoListsRe(ListNode list1, ListNode list2) {
		if (list1 == null) return list2;
		if (list2 == null) return list1;
		if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next,list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list2.next,list1);
			return list2;
		}
	}
	

}
