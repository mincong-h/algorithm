public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {

        int index1 = -1;
        int index2 = -1;
        int length = words.length;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
                if (index2 >= 0)
                    length = Math.min(length, Math.abs(index1 - index2));
            }
            if (words[i].equals(word2)) {
                index2 = i;
                if (index1 >= 0)
                    length = Math.min(length, Math.abs(index1 - index2));
            }
        }
        return length;
    }
}
