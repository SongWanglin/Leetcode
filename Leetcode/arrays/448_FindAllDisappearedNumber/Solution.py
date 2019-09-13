class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        for i in range(len(nums)):
            k = abs(nums[i])-1
            nums[k] = -abs(nums[k])
        return [i+1 for i, num in enumerate(nums) if num>0]
