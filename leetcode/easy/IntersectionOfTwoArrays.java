class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> candidates = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums1) {
            candidates.add(num);
        }
        for (int num : nums2) {
            if (candidates.contains(num)) {
                intersection.add(num);
            }
        }
        int[] arr = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            arr[i] = num;
            i++;
        }
        return arr;
    }
}
