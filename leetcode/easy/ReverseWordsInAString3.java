class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        int len = s.length();
        char[] src = s.toCharArray();
        char[] dest = new char[len];

        while (end < len) {
            // next word
            while (end < len && s.charAt(end) != ' ') {
                end++;
            }
            copyReversely(src, dest, start, end);

            // next space
            if (end < len) {
                dest[end] = ' ';
            }
            end++;
            start = end;
        }
        return new String(dest);
    }

    /**
     * @param start start-index (inclusive)
     * @param end end-index (exclusive)
     */
    private void copyReversely(char[] src, char[] dest, int start, int end) {
        int len = end - start;
        for (int i = 0; i < len; i++) {
            dest[start + i] = src[end - 1 - i];
        }
    }
}
