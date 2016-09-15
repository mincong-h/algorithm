public class Solution {
    public boolean canPermutePalindrome(String s) {
        boolean isOdd[] = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            isOdd[(int) s.charAt(i)] = !isOdd[(int) s.charAt(i)];
        }
        int oddCount = 0;
        for (int i = 0; i < isOdd.length; i++) {
            if (isOdd[i]) {
                oddCount++;
            }
        }
        return oddCount < 2;
    }
}
