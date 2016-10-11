/**
 * Company tags: Amazon, Bloomberg, Uber, Facebook, Yelp.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null) {
            return null;
        }
        Map<String, List<String>> anagrams = new HashMap<>();
        Arrays.sort(strs);
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
            }
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
