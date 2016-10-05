public class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        if (word == null || abbr == null) return false;
        if (word.isEmpty()) return abbr.isEmpty();

        int i = 0;
        int left = 0;
        int right = 0;

        while (left < abbr.length() && i < word.length()) {

            if (word.charAt(i) == abbr.charAt(left)) {
                left++;
                i++;

            } else if (!Character.isDigit(abbr.charAt(left))) {
                return false;

            } else {
                right = left;
                while (right < abbr.length() && Character.isDigit(abbr.charAt(right))) {
                    right++;
                }
                int offset = Integer.parseInt(abbr.substring(left, right));
                if (abbr.charAt(left) == '0') {
                    return false;
                }
                if (i + offset == word.length() && right == abbr.length()) {
                    return true;
                }
                if (i + offset < word.length() && right < abbr.length() &&
                        word.charAt(i + offset) == abbr.charAt(right)) {
                    left = right;
                    i += offset;
                } else {
                    return false;
                }
            }
        }
        return (i == word.length() && left == abbr.length());
    }
}
