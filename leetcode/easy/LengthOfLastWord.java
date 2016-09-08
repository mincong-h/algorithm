public class Solution {
    public int lengthOfLastWord(String s) {

        int lengthOfLast = 0;
        boolean tailSpaceSkipped = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (!tailSpaceSkipped) {
                    continue;
                } else {
                    return lengthOfLast;
                }
            } else {
                tailSpaceSkipped = true;
                lengthOfLast++;
            }
        }
        return lengthOfLast;
    }
}
