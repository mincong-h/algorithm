class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words.length < 2) {
            return true;
        }
        // Create English-version of alien language
        int[] table = new int[26];
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            table[(int)(c - 'a')] = i;
        }
        // Array "words" is sorted if and only if every neighbour
        // elements A / B saftisfy A < B.
        int[] alienA = toAlienTable(words[0], table);
        int[] alienB;
        for (int i = 1; i < words.length; i++) {
            String a = words[i - 1];
            String b = words[i];
            alienB = toAlienTable(b, table);
            int j = 0;
            while (j < 20) {
                // lexicographical comparaison (alien)
                if (alienA[j] < alienB[j]) {
                    break;
                } else if (alienA[j] > alienB[j]) {
                    return false;
                }
                j++;
            }
            alienA = alienB;
        }
        return true;
    }

    private int[] toAlienTable(String s, int[] mapping) {
        int[] arr = new int[20];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = mapping[(int) (s.charAt(i) - 'a')];
        }
        for (int i = s.length(); i < 20; i++) {
            arr[i] = -1;
        }
        return arr;
    }
}
