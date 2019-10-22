class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        return self.rotated_bisect(0, len(nums)-1, nums, target)

    def rotated_bisect(self, begin, end, nums,target):
        if begin>end:
            return -1
        mid = begin + (end-begin)//2
        if nums[mid]==target:
            return mid
        if nums[begin] <= nums[mid]:        # the first half is sorted
            if nums[begin]<=target<=nums[mid]:
                return self.rotated_bisect(begin, mid-1, nums, target)
            return self.rotated_bisect(mid+1, end, nums, target)
        else:
            if nums[mid]<=target<=nums[end]:
                return self.rotated_bisect(mid+1, end, nums, target)
            else:
                return self.rotated_bisect(begin, mid-1, nums, target)
