class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        char[] arr = S.toCharArray();
        int[] distances = new int[len];
        for (int i = 0; i < len; i++) {
            distances[i] = len;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] == C) {
                distances[i] = 0;
                // backward
                int j = i - 1;
                int d = 1;
                while (j >= 0 && arr[j] != C && distances[j] > d) {
                    distances[j] = d;
                    j--;
                    d++;
                }
                // foreward
                j = i + 1;
                d = 1;
                while (j < len && arr[j] != C && distances[j] > d) {
                    distances[j] = d;
                    j++;
                    d++;
                }
            }
        }
        return distances;
    }
}
