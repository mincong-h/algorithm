package com.leetcode.easy;

/*
 * Given a sorted linked list, delete all duplicates such that each 
 * element appear only once. For example,
 *   Given 1->1->2, return 1->2.
 *   Given 1->1->2->3->3, return 1->2->3.
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(3);
		ListNode newHead = deleteDuplicates(head);
		System.out.printf("%d->%d->%d",
							newHead.val,
							newHead.next.val,
							newHead.next.next.val);
							//newHead.next.next.next.val,
							//newHead.next.next.next.next.val);
		
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head != null) {
			// recursive duplication check
			if(head.next != null)
				head.next = deleteDuplicates(head.next);
			// if head has a next list-node and the next list-node 
			// contains the same value as head, we will skip the
			// next and link the next plus. As head and next
			// contain the same value, we won't have any data 
			// manipulation.
			if(head.next != null && head.val == head.next.val)
				head.next = head.next.next;
		}
        return head;
    }
}
