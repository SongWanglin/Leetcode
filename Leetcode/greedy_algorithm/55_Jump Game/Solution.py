class Solution:
    def canJump(self, nums: List[int]) -> bool:
        if not nums or len(nums)==1: return True
        furthest = nums[0]
        for i in range(len(nums)):
            if i<=furthest and nums[i]+i>furthest:
                furthest = nums[i]+i
        return furthest>=len(nums)-1
