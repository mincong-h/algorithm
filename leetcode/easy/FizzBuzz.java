/**
 * {@link https://leetcode.com/problems/fizz-buzz/}
 */
public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> results = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String msg = "";
            msg += i % 3 == 0 ? "Fizz" : "";
            msg += i % 5 == 0 ? "Buzz" : "";
            results.add(msg.isEmpty() ? "" + i : msg);
        }
        return results;
    }
}
