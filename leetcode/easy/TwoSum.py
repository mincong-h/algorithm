class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        mapping = {}
        for i, num in enumerate(nums):
            if target - num in mapping:
                return [mapping.get(target - num), i]
            else:
                mapping[num] = i
