public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] hasSubquence = new boolean[s.length() + 1];
        hasSubquence[0] = true;
        for (int R = 1; R <= s.length(); R++){
            for (int L = 0; L < R; L++){
                if (hasSubquence[L] && wordDict.contains(s.substring(L, R))){
                    hasSubquence[R] = true;
                    break;
                }
            }
        }
        return hasSubquence[s.length()];
    }
}
