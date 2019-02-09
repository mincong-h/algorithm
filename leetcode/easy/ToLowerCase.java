class Solution {
    public String toLowerCase(String str) {
        int len = str.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                int offset = (int) c - 'A';
                arr[i] = (char) ('a' + offset);
            } else {
                arr[i] = c;
            }
        }
        return new String(arr);
    }
}
