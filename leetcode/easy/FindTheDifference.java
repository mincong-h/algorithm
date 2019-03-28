class Solution {
    public char findTheDifference(String s, String t) {
        int letter = 0;
        int i = 0;
        while (i < s.length()) {
            letter += t.charAt(i) - s.charAt(i);
            i++;
        }
        letter += t.charAt(i);
        return (char) letter;
    }
}
