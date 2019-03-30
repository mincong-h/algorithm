/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum;
        ListNode head = new ListNode(0);
        ListNode node = head;
        do {
            sum = l1.val + l2.val + carry;
            node.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        } while (l1 != null && l2 != null);
        ListNode n = l1 != null ? l1 : l2;
        while (n != null) {
            sum = n.val + carry;
            node.next = new ListNode(sum % 10);
            carry = sum / 10;
            n = n.next;
            node = node.next;
        }
        if (carry > 0) {
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}
