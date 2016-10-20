/**
 * Written on whiteboard. 30 mins, 1 submission.
 * {@link https://leetcode.com/problems/add-strings/}
 */
public class Solution {
  public String addStrings(String num1, String num2) {

    int L1 = num1.length();
    int L2 = num2.length();
    StringBuilder sb = new StringBuilder();
    int sum = 0;

    for (int i = 0; i < Math.max(L1, L2); i++) {
      sum += i < L1 ? (int) num1.charAt(L1 - 1 - i) - '0' : 0;
      sum += i < L2 ? (int) num2.charAt(L2 - 1 - i) - '0' : 0;
      sb.append(sum % 10);
      sum /= 10;
    }
    sb.append(sum > 0 ? sum : "");
    return sb.reverse().toString();
  }
}

