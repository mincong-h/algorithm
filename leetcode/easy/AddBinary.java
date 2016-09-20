public class Solution {
    public String addBinary(String a, String b) {

        boolean carry = false;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry) {
            int val = 0;
            val += i >= 0 ? (int) a.charAt(i--) - '0' : 0;
            val += j >= 0 ? (int) b.charAt(j--) - '0' : 0;
            val += carry ? 1 : 0;
            // carry value if needed
            if (val > 1) {
                val -= 2; carry = true;
            } else {
                carry = false;
            }
            sb.append(val);
        }
        return sb.reverse().toString();
    }
}
