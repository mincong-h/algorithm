/**
 * Your Solution object will be instantiated and called as such:
 * <pre>
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 * </pre>
 *
 * Definition for singly-linked list.
 * <pre>
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * </pre>
 */
public class Solution {

    private int len = 0;
    private ListNode head;

    /**
     * @param head The linked list's head. Note that the head is guaranteed
     *      to be not null, so it contains at least one node.
     */
    public Solution(ListNode head) {
        this.head = head;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            len++;
        }
    }
    
    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        int k = (int)(Math.random() * len);
        ListNode node = head;
        while (k > 0) {
            node = node.next;
            k--;
        }
        return node.val;
    }
}
