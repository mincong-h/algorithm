public class ValidWordAbbr {

    /**
     * key: abbr
     * val: list of words
     */
    private Map<String, List<String>> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for (String word : dictionary) {
            String abbr = abbr(word);
            if (!map.containsKey(abbr)) {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(abbr, words);
            } else {
                List<String> words = map.get(abbr);
                if (!words.contains(word)) {
                    words.add(word);
                    map.put(abbr, words);
                }
            }
        }
    }

    public boolean isUnique(String word) {
        String abbr = abbr(word);
        if (map.get(abbr) == null) {
            return true;
        }
        List<String> words = map.get(abbr);
        if (words.contains(word) && words.size() == 1) {
            return true;
        }
        return false;
    }

    public String abbr(String word) {
        String abbr = word;
        if (word.length() > 2) {
            abbr = word.charAt(0)
                    + String.valueOf(word.length() - 2)
                    + word.charAt(word.length() - 1);
        }
        return abbr;
    }
}
