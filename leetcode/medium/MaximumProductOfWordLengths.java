public class Solution {

    public int maxProduct(String[] words) {

        int maxProduct = 0;
        int[][] charCount = new int[words.length][26];

        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                charCount[i][(int) c - 'a']++;
            }
        }

        for (int i1 = 0; i1 < words.length; i1++) {
            for (int i2 = i1 + 1; i2 < words.length; i2++) {

                boolean hasCommonLetter = false;
                for (int j = 0; j < 26; j++) {
                    if (charCount[i1][j] > 0 && charCount[i2][j] > 0) {
                        hasCommonLetter = true;
                        break;
                    }
                }
                if (!hasCommonLetter) {
                    maxProduct = Math.max(maxProduct, words[i1].length() * words[i2].length());
                }
            }
        }
        return maxProduct;
    }
}
