/**
 * Written in Google Doc.
 * {@link https://leetcode.com/problems/sort-transformed-array/}
 * Company tags: Google.
 */
public class Solution {
  /**
   * f'(x)  = 2ax + b => At f'(x) == 0, symmetric axe reaches (x = -b/2a).
   * f''(x) = 2a      => Use a to determine to the approach
   */
  public int[] sortTransformedArray(int[] nums, int a, int b, int c) {

    int left = 0;
    int right = nums.length - 1;
    double symmetricNum = - b / (2F * a);
    int[] results = new int[nums.length];

    // if ( f''(x) > 0 ), the lowest val reaches at x = - b / 2a
    if (a > 0) {
      int i = results.length - 1;
      while (left <= right && i >= 0) {
        double distanceL = Math.abs(nums[left] - symmetricNum);
        double distanceR = Math.abs(nums[right] - symmetricNum);
        int x = distanceL > distanceR ? nums[left++] : nums[right--];
        results[i--] = a * x * x + b * x + c;
      }

    // if ( f''(x) < 0 ), the greatest val reaches at x = - b / 2a
    } else if (a < 0) {
      int i = 0;
      while (left <= right && i < results.length) {
        double distanceL = Math.abs(nums[left] - symmetricNum);
        double distanceR = Math.abs(nums[right] - symmetricNum);
        int x = distanceL > distanceR ? nums[left++] : nums[right--];
        results[i++] = a * x * x + b * x + c;
      }

    // if ( f''(x) == 0 ), the order depends on coeff b
    } else {
      for (int i = 0; i < nums.length; i++) {
        int x = nums[i];
        int result = a * x * x + b * x + c;
        if (b > 0) {
          results[i] = result;
        } else {
          results[nums.length - 1 - i] = result;
        }
      }
    }
    return results;
  }
}

