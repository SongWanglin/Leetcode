class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if max(nums) < 0: return max(nums)
        maxSoFar, maxEndingHere = 0, 0
        for num in nums:
            maxEndingHere = max(0, maxEndingHere+num)
            maxSoFar = max(maxSoFar, maxEndingHere)
        return maxSoFar
