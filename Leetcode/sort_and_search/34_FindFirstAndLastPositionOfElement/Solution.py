class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        return [nums.index(target), len(nums)-1-(nums[::-1].index(target))] if target in nums else [-1, -1]
