public class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> s2tMapping = new HashMap<>();
        Map<Character, Character> t2sMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s2tMapping.get(s.charAt(i)) == null &&
                t2sMapping.get(t.charAt(i)) == null) {

                s2tMapping.put(s.charAt(i), t.charAt(i));
                t2sMapping.put(t.charAt(i), s.charAt(i));

            } else if (s2tMapping.get(s.charAt(i)) == null ||
                t2sMapping.get(t.charAt(i)) == null) {
                return false;

            // mapping exists but not matched to the current char
            } else if (s2tMapping.get(s.charAt(i)) != t.charAt(i)
                    || t2sMapping.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
