public class Solution {
    /**
     * The XOR of 2 identical numbers x is 0: <code>x ^ x = 0</code>
     * The XOR of 0 and x is x: <code>x ^ 0 = x</code>
     */
    public int singleNumber(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single = single ^ nums[i];
        }
        return single;
    }
}
