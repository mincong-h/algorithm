public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (map.containsKey(v)) {
                return new int[]{map.get(v), i};
            } else {
                map.put(target - v, i);
            }
        }
        return null;
    }
}
