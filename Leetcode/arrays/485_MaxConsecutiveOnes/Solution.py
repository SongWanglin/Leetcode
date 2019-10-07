class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res, curSum = 0, 0
        for num in nums:
            curSum = curSum+num if num else 0
            res = max(res, curSum)
        return res
