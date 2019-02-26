class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 0;

        while (right < len) {
            while (right < len && arr[right] != ' ') {
                right++;
            }
            for (int i = left, j = right - 1; i < j; i++, j--) {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
            }
            right++;
            left = right;
        }
        return new String(arr);
    }
}
