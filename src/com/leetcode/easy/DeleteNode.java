package com.leetcode.easy;

/*
 * Write a function to delete a node (except the tail) in a singly linked
 * list, given only access to that node. Supposed the linked list is 
 * 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the 
 * linked list should become 1 -> 2 -> 4 after calling your function.
 * 
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNode {

	public static void main(String[] args) {
		ListNode a;
		a = new ListNode(0);
		a.next = new ListNode(0);
		a.next.next = new ListNode(0);
		a.next.next.next = new ListNode(0);
		//delete node c
		deleteNode(a);
	}
	
	public static void deleteNode(ListNode node) {
		if(node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		} else {
			node = null;
		}
	}
}
