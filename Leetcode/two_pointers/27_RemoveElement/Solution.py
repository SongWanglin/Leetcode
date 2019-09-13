class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        firstVal = 0
        while firstVal < len(nums) and nums[firstVal]!=val :
            firstVal += 1
        tracker = firstVal+1
        while tracker < len(nums):
            if nums[tracker]!=val:
                nums[firstVal], nums[tracker] = nums[tracker], nums[firstVal]
                firstVal += 1
            tracker += 1
        return firstVal
