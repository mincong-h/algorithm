/**
 * Written in LeetCode IDE. 20 mins, 1 submission.
 * {@link https://leetcode.com/problems/merge-k-sorted-lists/}
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null) return null;

        ListNode result = new ListNode(0); // dummy head
        ListNode resultPtr = result;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(1, new Comparator<ListNode>() {
            public int compare(ListNode node1, ListNode node2) {
                return node1.val - node2.val;
            }
        });

        // enqueue lists
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }

        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            resultPtr.next = new ListNode(node.val);
            resultPtr = resultPtr.next;
            node = node.next;
            // re-enqueue the remaing of the node
            if (node != null) queue.add(node);
        }
        return result.next;
    }
}

