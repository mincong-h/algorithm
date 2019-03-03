class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        m = nums[0];
        s = nums[0];
        for i in range(1, len(nums)):
            s = max(s + nums[i], nums[i])
            if m < s:
                m = s
        return m
