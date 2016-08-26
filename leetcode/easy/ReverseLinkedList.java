package com.leetcode.easy;

/*
 * Reverse a singly linked list.
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		System.out.printf("%d->%d->%d->%d\n",
						head.val,
						head.next.val,
						head.next.next.val,
						head.next.next.next.val);
		ListNode revHead = reverseList(head);
		System.out.printf("%d->%d->%d->%d\n",
						revHead.val,
						revHead.next.val,
						revHead.next.next.val,
						revHead.next.next.next.val);
		
	}
	
	// method 1
	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		} else {
			ListNode first = new ListNode(head.val);
			ListNode second = reverseList(head.next);
			ListNode tail = second;
			while(tail.next != null)
				tail = tail.next;
			tail.next = first;
			return second;
		}
	}

}
