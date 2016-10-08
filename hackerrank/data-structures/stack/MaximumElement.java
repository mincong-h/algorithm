import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /**
     * Time complexity : O(n)
     * Space complexity : O(n)
     *
     * {@link https://www.hackerrank.com/challenges/maximum-element}
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        Scanner in = new Scanner(System.in);

        // The next N lines each contain an above mentioned query
        int N = in.nextInt();

        // N queries
        while (N > 0) {
            int type = in.nextInt();
            // 1 x  -Push the element x into the stack.
            // 2    -Delete the element present at the top of the stack.
            // 3    -Print the maximum element in the stack.
            switch (type) {
                case 1:
                    int val = in.nextInt();
                    stack.push(val);
                    if (maxStack.empty()) {
                        maxStack.push(val);
                    } else {
                        int max = Math.max(val, maxStack.peek());
                        maxStack.push(max);
                    }
                    break;
                case 2:
                    if (!stack.empty()) {
                        stack.pop();
                    }
                    if (!maxStack.empty()) {
                        maxStack.pop();
                    }
                    break;
                case 3:
                    if (!maxStack.empty()) {
                        System.out.println(maxStack.peek());
                    }
                    break;
            }
            N--;
        }
    }
}
