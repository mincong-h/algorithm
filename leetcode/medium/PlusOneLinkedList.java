/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public ListNode plusOne(ListNode head) {
        boolean isCarry = dfs(head);
        if (isCarry) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    /**
     * Plus one to the given list node using depth-first-search.
     *
     * @param head head of list node
     * @return if carry
     */
    private boolean dfs(ListNode head) {
        if (head == null) {
            return true;
        }
        boolean isCarry = dfs(head.next);
        if (isCarry) {
            head.val++;
            if (head.val == 10) {
                head.val = 0;
                return true;
            }
        }
        return false;
    }
}
