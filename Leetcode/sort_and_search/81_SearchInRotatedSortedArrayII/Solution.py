class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """
        if not nums:
            return False
        start, end = 0, len(nums)-1
        mid = start + (end-start)//2
        if nums[mid]==target:
            return True
        if nums[mid]==nums[end]:
            return self.search(nums[:end], target)
        if nums[start]<=nums[mid]:
            if nums[start]<=target<=nums[mid]:
                return self.search(nums[:mid], target)
            else:
                return self.search(nums[mid+1:], target)
        if nums[mid]<=nums[end]:
            if nums[mid]<=target<=nums[end]:
                return self.search(nums[mid+1:], target)
            else:
                return self.search(nums[:mid], target)
