class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        firstZero = 0
        while firstZero < len(nums) and nums[firstZero]!=0 :
            firstZero += 1
        tracker = firstZero+1
        while tracker < len(nums):
            if nums[tracker]!=0:
                nums[firstZero], nums[tracker] = nums[tracker], nums[firstZero]
                firstZero += 1
            tracker += 1
