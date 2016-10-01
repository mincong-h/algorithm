/**
 * Solution 1
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        while (pointerA != null) {
            stackA.push(pointerA.val);
            pointerA = pointerA.next;
        }
        while (pointerB != null) {
            stackB.push(pointerB.val);
            pointerB = pointerB.next;
        }

        // find the common part between A & B, then build the comment node
        ListNode intersect = null;
        while (!stackA.empty() && !stackB.empty() && stackA.peek().equals(stackB.peek())) {
            ListNode newHead = new ListNode(stackA.pop());
            stackB.pop();
            newHead.next = intersect;
            intersect = newHead;
        }
        return intersect;
    }
}

/**
 * Solution 2
 */
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //boundary check
    if(headA == null || headB == null) return null;

    ListNode a = headA;
    ListNode b = headB;

    //if a & b have different len, then we will stop the loop after second iteration
    while(a != b) {
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        a = a == null ? headB : a.next;
        b = b == null ? headA : b.next;    
    }

    return a;
}
