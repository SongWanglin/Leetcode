class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        start, end = 0, len(nums)
        while end-start>=3:
            mid = (start+end)//2
            if nums[mid]>nums[mid-1] and nums[mid+1]<nums[mid]:
                return mid
            elif nums[mid]>nums[mid-1] and nums[mid+1]>nums[mid]:
                start = mid
            else:
                end = mid
        return nums.index(max(nums))

