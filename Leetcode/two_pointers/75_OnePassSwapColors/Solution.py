class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        lastOne, firstTwo = 0, len(nums)-1
        while not lastOne > firstTwo:
            if nums[lastOne]==1:
                lastOne+=1
            elif nums[lastOne]==0:
                nums.insert(0, nums.pop(lastOne))
                lastOne+=1
            else:
                nums.append(nums.pop(lastOne))
                firstTwo-=1
