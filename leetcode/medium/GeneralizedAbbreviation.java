/**
 * @author soymuybien
 */
public class Solution {
    public List<String> generateAbbreviations(String word) {
        List<String> ret = new LinkedList<>();
        backtrack(ret, word, 0, "", 0);
        return ret;
    }
    
    private void backtrack(List<String> ret, String word, int pos, String cur, int count) {
        String cmp = count > 0 ? String.valueOf(count) : "";
        if (pos == word.length()) {
            cur += cmp;
            ret.add(cur);
            return;
        }
        backtrack(ret, word, pos + 1, cur, count + 1);
        backtrack(ret, word, pos + 1, cur + cmp + word.charAt(pos), 0);
    }
}
