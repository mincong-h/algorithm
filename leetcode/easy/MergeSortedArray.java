class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int x = m - 1;
        int y = n - 1;
        while (x >= 0 && y >= 0) {
            if (nums1[x] > nums2[y]) {
                nums1[i] = nums1[x];
                i--;
                x--;
            } else {
                nums1[i] = nums2[y];
                i--;
                y--;
            }
        }
        for (int j = y; j >= 0; j--) {
            nums1[j] = nums2[j];
        }
    }
}
