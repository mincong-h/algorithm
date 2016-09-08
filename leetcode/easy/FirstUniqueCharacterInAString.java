public class Solution {
    public int firstUniqChar(String s) {

        if (s == null || s.isEmpty()) {
            return -1;
        }

        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            chars[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (chars[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}
