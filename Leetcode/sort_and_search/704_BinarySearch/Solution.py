class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums == []:  return -1
        start, end = 0, len(nums)-1
        while start<=end:
            mid = (end+start)//2
            if(nums[mid]==target):
                return mid
            elif nums[mid]>target:
                end = mid-1
            else:
                start = mid+1
        return -1
