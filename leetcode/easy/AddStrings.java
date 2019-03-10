class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int maxLen = l1 > l2 ? l1 : l2;
        char[] arr = new char[maxLen];
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int n1 = i < num1.length() ? (int)(num1.charAt(l1 - 1 - i) - '0') : 0;
            int n2 = i < num2.length() ? (int)(num2.charAt(l2 - 1 - i) - '0') : 0;
            int sum = n1 + n2 + carry;
            arr[maxLen - 1 - i] = (char)(sum % 10 + (int) '0');
            carry = sum / 10;
        }
        return carry > 0 ? carry + new String(arr) : new String(arr);
    }
}
