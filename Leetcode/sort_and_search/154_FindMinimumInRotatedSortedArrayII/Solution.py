class Solution(object):
    def findMin(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums)==1:
            return nums[0]
        if len(nums)==2:
            return min(nums[0], nums[1])
        start, end = 0, len(nums)-1
        mid = start + (end-start)//2
        if mid-1>=0 and nums[mid]<nums[mid-1]:
            return nums[mid]
        if nums[mid]==nums[end]:
            return self.findMin(nums[:end])
        if nums[start]<=nums[mid]:
            if nums[start]<=nums[mid]<=nums[end]:
                return self.findMin(nums[:mid])
            else:
                return self.findMin(nums[mid+1:])
        if nums[mid]<=nums[end]:
            return self.findMin(nums[:mid])
