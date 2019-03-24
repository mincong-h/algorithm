/**
 * Company tags: Amazon, Bloomberg, Uber, Facebook, Yelp.
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            int[] table = new int[26];
            for (char c : str.toCharArray()) {
                table[c - 'a']++;
            }
            int key = Arrays.hashCode(table);
            List<String> value = groups.getOrDefault(key, new LinkedList<>());
            value.add(str);
            groups.put(key, value);
        }
        return new LinkedList<>(groups.values());
    }
}
