class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        List[] volume = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> f : frequencies.entrySet()) {
            int v = f.getValue();
            if (volume[v] == null) {
                volume[v] = new ArrayList<>();
            }
            volume[v].add(f.getKey());
        }

        // descending
        List<Integer> results = new ArrayList<>(k);
        for (int i = volume.length - 1; i >= 0 && results.size() < k; i--) {
            if (volume[i] != null) {
                results.addAll(volume[i]);
            }
        }
        return results;
    }
}
