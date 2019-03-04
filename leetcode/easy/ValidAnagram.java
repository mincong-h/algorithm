class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = (int)(s.charAt(i) - 'a');
            counts[idx]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int idx = (int)(t.charAt(i) - 'a');
            counts[idx]--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
