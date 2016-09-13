public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>(Math.min(nums1.length, nums2.length));

        // build a map using nums1
        for (int i = 0; i < nums1.length; i++) {
            if (map.get(nums1[i]) == null) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], 1 + map.get(nums1[i]));
            }
        }

        // interate the longer array for getting the intersection value
        for (int i = 0; i < nums2.length; i++) {
            if (map.get(nums2[i]) != null && map.get(nums2[i]) > 0) {
                intersection.add(nums2[i]);
                map.put(nums2[i], -1 + map.get(nums2[i]));
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
