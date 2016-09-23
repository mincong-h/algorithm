public class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] products = new int[nums.length];

        // calculate the product of all the nums
        // having index less than the current one
        products[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            products[i] = products[i - 1] * nums[i - 1];
        }

        // calculate the product again for all the
        // existing products in array
        int product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= product;
            product *= nums[i];
        }
        return products;
    }
}
