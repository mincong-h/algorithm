class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] table = new int[128];
        for (char c : s1.toCharArray()) {
            table[c]++;
        }
        int left = 0;
        int right = 0;
        int todo = s1.length();
        while (right < s2.length()) {
            if (table[s2.charAt(right)] > 0) {
                todo--;
            }
            table[s2.charAt(right)]--;
            right++;
            if (todo == 0) {
                return true;
            }
            if (right - left == s1.length()) {
                if (table[s2.charAt(left)] >= 0) {
                    todo++;
                }
                table[s2.charAt(left)]++;
                left++;
            }
        }
        return false;
    }
}
