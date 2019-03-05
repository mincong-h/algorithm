/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// recursive
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// iterative
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode head;
        if (n1.val < n2.val) {
            head = n1;
            n1 = n1.next;
        } else {
            head = n2;
            n2 = n2.next;
        }
        ListNode n = head;
        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                n.next = n1;
                n1 = n1.next;
            } else {
                n.next = n2;
                n2 = n2.next;
            }
            n = n.next;
        }
        n.next = n1 != null ? n1 : n2;
        return head;
    }
}
