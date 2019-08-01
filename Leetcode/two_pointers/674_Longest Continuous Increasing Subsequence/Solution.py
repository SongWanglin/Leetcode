class Solution(object):
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==0:
            return 0
        res = 1
        slow = -1
        fast = 0
        while fast < len(nums)-1:
            if(nums[fast]>=nums[fast+1]):
                res = max(fast-slow, res)
                slow = fast
            fast += 1
        return max(res, fast-slow)
