/**
 * Written in Google Doc.
 * {@link https://leetcode.com/problems/remove-k-digits/}
 */
public class Solution {
  public String removeKdigits(String num, int k) {

    Stack<Character> remaining = new Stack<>();
    for (char digit : num.toCharArray()) {
      while (!remaining.empty() && remaining.peek() > digit && k > 0) {
        remaining.pop();
        k--;
      }
      remaining.push(digit);
    }

    while (k > 0) {
      remaining.pop();
      k--;
    }

    StringBuilder sb = new StringBuilder();
    while (!remaining.empty()) {
      sb.append(remaining.pop());
    }
    String result = sb.reverse().toString();
    // remove 0 from the head of the string
    int i = 0;
    while (i < result.length() && result.charAt(i) == '0') {
      i++;
    }
    result = result.substring(i);
    return result.isEmpty() ? "0" : result;
  }
}

