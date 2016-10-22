/**
 * {@link https://leetcode.com/problems/convert-a-number-to-hexadecimal/}
 */
public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append("0123456789abcdef".charAt((num & 15)));
            num = (num >>> 4);
        }
        return sb.reverse().toString();
    }
}
