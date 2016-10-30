public class WordDistance {

    private Map<String, List<Integer>> map;

    public WordDistance(String[] words) {
        map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.get(words[i]).add(i);
            } else {
                List<Integer> indexes = new LinkedList<>();
                indexes.add(i);
                map.put(words[i], indexes);
            }
        }
    }

    public int shortest(String word1, String word2) {
        int min = Integer.MAX_VALUE;
        for (int i1 : map.get(word1)) {
            for (int i2 : map.get(word2)) {
                min = Math.min(min, Math.abs(i1 - i2));
            }
        }
        return min;
    }
}
