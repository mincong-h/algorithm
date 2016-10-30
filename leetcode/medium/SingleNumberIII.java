public class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> singles = new HashSet<>();
        for (int num : nums) {
            if (singles.contains(num)) {
                singles.remove(num);
            } else {
                singles.add(num);
            }
        }
        int i = 0;
        int[] results = new int[singles.size()];
        for (int single : singles) {
            results[i++] = single;
        }
        return results;
    }
}
