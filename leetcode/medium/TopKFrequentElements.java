public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<Integer,Integer> e: freq.entrySet()) {
            queue.add(e);
        }
        List<Integer> topK = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            topK.add(queue.poll().getKey());
        }
        return topK;
    }
}
