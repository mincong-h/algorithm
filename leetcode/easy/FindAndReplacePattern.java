class Solution {
    /**
     * The key of the solution is to ensure that an one-to-one
     * mapping is respected for all the characters between a word
     * and the pattern.
     */
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> results = new ArrayList<>();
        WORD: for (String word : words) {
            char[] w2p = new char[26]; // word-pattern mappings
            char[] p2w = new char[26]; // pattern-word mappings

            for (int i = 0; i < word.length(); i++) {
                char wc = word.charAt(i);
                char pc = pattern.charAt(i);
                int x = (int)(wc - 'a');
                int y = (int)(pc - 'a');
                if (w2p[x] == '\u0000' && p2w[y] == '\u0000') {
                    w2p[x] = pc;
                    p2w[y] = wc;
                } else {
                    if (w2p[x] != pc || p2w[y] != wc) {
                        // mapping is not respected,
                        // skip this word
                        continue WORD;
                    }
                }
            }
            // all mappings respected => pattern respected
            results.add(word);
        }
        return results;
    }
}
