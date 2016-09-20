public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer prev = map.get(nums[i]);
            if (prev == null || i - prev > k) {
                map.put(nums[i], i);
            } else {
                return true;
            }
        }
        return false;
    }
}
