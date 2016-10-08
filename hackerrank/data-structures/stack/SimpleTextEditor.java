import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * {@link https://www.hackerrank.com/challenges/simple-text-editor}
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int nbOperations = in.nextInt();

        Stack<Integer> operationStack = new Stack<>();
        Stack<String> valueStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        while (nbOperations > 0) {
            int type = in.nextInt();
            switch (type) {
                // operation 1 : append
                case 1 :
                    operationStack.push(1);
                    String val = in.next();
                    valueStack.push(val);
                    sb.append(val);
                    break;

                // operation 2 : delete the last k chars
                case 2 :
                    operationStack.push(2);
                    int k = in.nextInt();
                    valueStack.push(sb.substring(sb.length() - k)); // save the substring before delete
                    sb.delete(sb.length() - k, sb.length());
                    break;

                // operation 3 : print the k-th char (base1)
                case 3 :
                    System.out.println(sb.charAt(in.nextInt() - 1)); // base1 -> base0
                    break;

                // operation 4 : redo
                case 4 :
                    if (!operationStack.empty()) {
                        int operation = operationStack.pop();

                        // if operation is append, then delete.
                        if (operation == 1) {
                            String prevStr = valueStack.pop();
                            sb.delete(sb.length() - prevStr.length(), sb.length());
                            
                        // if operation is delete, then append.
                        } else if (operation == 2) {
                            sb.append(valueStack.pop());
                        }
                    }
                    break;
            }
            nbOperations--;
        }
    }
}
