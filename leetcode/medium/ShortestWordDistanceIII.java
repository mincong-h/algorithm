public class Solution {

    public int shortestWordDistance(String[] words, String word1, String word2) {

        int minDist = Integer.MAX_VALUE;
        int idx1 = -1;
        int idx2 = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                idx1 = i;
            }
            if (words[i].equals(word2)) {
                if (word1.equals(word2)) {
                    idx1 = idx2;
                }
                idx2 = i;
            }
            if (idx1 >= 0 && idx2 >= 0) {
                minDist = Math.min(Math.abs(idx1 - idx2), minDist);
            }
        }
        return minDist;
    }
}
