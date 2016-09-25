public class ValidWordAbbr {

    private Map<String, String> map;

    public ValidWordAbbr(String[] dictionary) {
        map = new HashMap<>();
        for (String word : dictionary) {
            if (map.containsKey(abbrOf(word)) && !word.equals(map.get(word))) {
                map.put(abbrOf(word), ""); // invalid key
            } else {
                map.put(abbrOf(word), word);
            }
        }
    }

    public boolean isUnique(String word) {
        if (word == null) {
            return false;
        } else if (map.containsKey(abbrOf(word)) && !word.equals(map.get(abbrOf(word)))) {
            return false;
        } else {
            return true;
        }
    }

    private String abbrOf(String word) {
        if (word.length() < 3) {
            return word;
        }
        return word.charAt(0)
                + String.valueOf(word.length() - 2)
                + word.charAt(word.length() - 1);
    }
}
