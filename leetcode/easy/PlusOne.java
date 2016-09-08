public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int temp = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            temp = digits[i] + carry;
            digits[i] = temp % 10;
            carry = temp / 10;
        }

        // if there's still an carry at the end
        if (carry == 1) {
            int[] resized = new int[digits.length + 1];
            System.arraycopy(digits, 0, resized, 1, digits.length);
            resized[0] = 1;
            return resized;
        } else {
            return digits;
        }
    }
}
