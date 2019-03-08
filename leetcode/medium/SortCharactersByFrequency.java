class Solution {
    public String frequencySort(String s) {
        int maxFreq = 0;

        // Frequency table (ASCII)
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int pos = (int) s.charAt(i);
            freq[pos]++;
            if (maxFreq < freq[pos]) {
                maxFreq = freq[pos];
            }
        }

        // Bucket sort
        List[] sorted = new List[maxFreq + 1];
        for (int i = 0; i < freq.length; i++) {
            int f = freq[i];
            if (f > 0) {
                if (sorted[f] == null) {
                    sorted[f] = new ArrayList<Integer>();
                }
                sorted[f].add(i);
            }
        }

        // Build result
        StringBuilder sb = new StringBuilder(s.length());
        for (int f = sorted.length - 1; f >= 0; f--) {
            List<Integer> values = (List<Integer>) sorted[f];
            if (values != null) {
                for (int v : values) {
                    char c = (char) v;
                    for (int i = 0; i < f; i++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
