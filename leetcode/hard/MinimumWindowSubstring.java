class Solution {
    public String minWindow(String s, String t) {
        int[] stock = new int[128];
        for (char c : t.toCharArray()) {
            stock[c]++;
        }

        int left = 0;
        int rightEx = 0;
        int todo = t.length();
        int minLen = s.length() + 1;
        String minWin = s;

        while (rightEx <= s.length()) {
            // solution found
            if (todo == 0) {
                int len = rightEx - left;
                if (minLen > len) {
                    minLen = len;
                    minWin = s.substring(left, rightEx);
                }
                if (stock[s.charAt(left)] >= 0) {
                    todo++;
                }
                stock[s.charAt(left)]++;
                // reduce window
                left++;
            } else {
                if (rightEx < s.length()) {
                    if (stock[s.charAt(rightEx)] > 0) {
                        todo--;
                    }
                    stock[s.charAt(rightEx)]--;
                }
                rightEx++;
            }
        }
        return minLen <= s.length() ? minWin : "";
    }
}
