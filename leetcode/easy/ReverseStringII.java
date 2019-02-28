class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length) {
            // reverse k chars
            int x = i;
            int y = i + k - 1;
            if (y >= arr.length) {
                y = arr.length - 1;
            }
            for ( ; x < y; x++, y--) {
                char c = arr[x];
                arr[x] = arr[y];
                arr[y] = c;
            }
            i += k * 2;
        }
        return new String(arr);
    }
}
