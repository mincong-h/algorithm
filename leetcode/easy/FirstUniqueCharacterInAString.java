public class Solution {
    public int firstUniqChar(String s) {
        int[] counts = new int[256];
        int len = s.length();
        // fill count table
        for (int i = 0; i < len; i++) {
            int idx = (int) s.charAt(i);
            counts[idx] = counts[idx] + 1;
        }
        // get first non-repeating
        for (int i = 0; i < len; i++) {
            int idx = (int) s.charAt(i);
            if (counts[idx] == 1) {
                return i;
            }
        }
        return -1;
    }
}
