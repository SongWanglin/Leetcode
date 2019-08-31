class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        res = nums[0]+nums[1]+nums[-1]
        for i in range(len(nums)-2):
            start, end = i+1, len(nums)-1
            while start<end:
                s = nums[i]+nums[start]+nums[end]
                if(abs(s-target)<abs(res-target)):
                    res = s
                if s>target:
                    end-=1
                else:
                    start+=1
        return res
