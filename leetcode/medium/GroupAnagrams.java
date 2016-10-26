/**
 * Company tags: Amazon, Bloomberg, Uber, Facebook, Yelp.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (groups.containsKey(key)) {
                List<String> group = groups.get(key);
                group.add(str);
            } else {
                List<String> group = new LinkedList<>();
                group.add(str);
                groups.put(key, group);
            }
        }
        return new LinkedList<>(groups.values());
    }
}
