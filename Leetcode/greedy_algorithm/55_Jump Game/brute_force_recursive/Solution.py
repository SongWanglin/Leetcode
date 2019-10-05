class Solution(object):
    def canJump(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if not nums or len(nums)==1: return True
        if nums[0]==0: return False
        res = False
        for i in range(1, nums[0]+1):
            res |= self.canJump(nums[i:])
        return res
