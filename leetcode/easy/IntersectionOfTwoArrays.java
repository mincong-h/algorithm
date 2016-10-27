public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> candidates = new HashSet<>();
        Set<Integer> intersect = new HashSet();

        for (int num : nums1) {
            candidates.add(num);
        }
        for (int num : nums2) {
            if (candidates.contains(num)) {
                intersect.add(num);
            }
        }

        int i = 0;
        int[] results = new int[intersect.size()];
        for (int num : intersect) {
            results[i++] = num;
        }
        return results;
    }
}
