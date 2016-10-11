/**
 * Company tags: Amazon, Microsoft, Uber.
 */
public class Solution {
    public void reverseWords(char[] s) {

        // reverse all the chars
        reverse(s, 0, s.length - 1);

        // for each sequenece, reverse itself to be a word
        int startIndex = 0;
        int endIndex = 0;
        while (startIndex < s.length && endIndex < s.length) {
            if (s[endIndex] == ' ') {
                reverse(s, startIndex, endIndex - 1);
                // next word
                endIndex++;
                startIndex = endIndex;
            } else {
                endIndex++;
            }
        }
        // reverse the last word
        reverse(s, startIndex, endIndex - 1);
    }

    private void reverse(char[] s, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            char c = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = c;
            startIndex++;
            endIndex--;
        }
    }
}
