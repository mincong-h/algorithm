class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mTable = new String[]{
            ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--",
            "--.."
        };
        Set<String> codes = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                int idx = (int)(word.charAt(i) - 'a');
                sb.append(mTable[idx]);
            }
            codes.add(sb.toString());
        }
        return codes.size();
    }
}
