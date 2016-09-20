public class Solution {
    public String reverseWords(String s) {

        StringBuilder builder = new StringBuilder();
        int wStart = s.length() - 1;
        int wLength = 0;

        while (wStart >= 0) {

            // meet a word
            if (s.charAt(wStart) != ' ') {
                wLength++;

            // meet spaces and has word to print
            } else if (wLength > 0) {
                String word = s.substring(wStart + 1, wStart + 1 + wLength);
                builder.append(" ").append(word);
                wLength = 0; 
            }
            wStart--;
        }
        // last word
        if (wLength > 0) {
            String word = s.substring(0, wLength);
            builder.append(" ").append(word);
        }
        return builder.length() == 0 ? "" : builder.toString().substring(1);
    }
}
