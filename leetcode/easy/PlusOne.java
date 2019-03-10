class Solution {
    public int[] plusOne(int[] digits) {
        int[] arr = new int[digits.length];
        boolean carry = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry) {
                int d = digits[i] + 1;
                if (d < 10) {
                    arr[i] = d;
                    carry = false;
                } else {
                    arr[i] = 0;
                    carry = true;
                }
            } else {
                arr[i] = digits[i];
            }
        }
        if (carry) {
            arr = new int[digits.length + 1];
            arr[0] = 1;
        }
        return arr;
    }
}
