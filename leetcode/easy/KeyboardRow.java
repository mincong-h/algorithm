class Solution {
    public String[] findWords(String[] words) {
        // Level 1: Q W E R T Y U I O P
        // Level 2: A S D F G H J K L
        // Level 3: Z X C V B N M
        int[] levels = {
            2, 3, 3, 2, 1, // ABCDE
            2, 2, 2, 1, 2, // FGHIJ
            2, 2, 3, 3, 1, // KLMNO
            1, 1, 1, 2, 1, // PQRST
            1, 3, 1, 3, 1, // UVWXY
            3              // Z
        };
        List<String> accepted = new ArrayList<>();
        WORD: for (String word : words) {
            char c = word.charAt(0);
            int x = c >= 'a' ? (int)(c - 'a') : (int)(c - 'A');
            int level = levels[x];
            for (int i = 1; i < word.length(); i++) {
                c = word.charAt(i);
                x = c >= 'a' ? (int)(c - 'a') : (int)(c - 'A');
                if (levels[x] != level) {
                    continue WORD;
                }
            }
            accepted.add(word);
        }
        return accepted.toArray(new String[accepted.size()]);
    }
}
