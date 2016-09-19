public class Solution {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) return 0;
        Arrays.sort(citations);
        int hIndex = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= hIndex) {
                return hIndex;
            } else {
                hIndex--;
            }
        }
        return hIndex;
    }
}
