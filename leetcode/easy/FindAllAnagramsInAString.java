public class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> anagramIndexes = new LinkedList<>();
        final int[] count = new int[26];
        for (char c : p.toCharArray()) {
            count[(int) c - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String candidate = s.substring(i, i + p.length());
            int[] _count = count.clone();
            for (char c : candidate.toCharArray()) {
                _count[(int) c - 'a']--;
            }
            boolean isAnagram = true;
            for (int c : _count) {
                isAnagram &= (c == 0);
            }
            if (isAnagram) {
                anagramIndexes.add(i);
            }
        }
        return anagramIndexes;
    }
}
