class Solution(object):
    def makesquare(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        nums.sort(reverse = True)
        numSum = sum(nums)
        if numSum == 0 or numSum%4 != 0:
            return False
        def dfs(nums, edges):
            if not nums:
                return True
            for i in range(4):
                if edges[i] >= nums[0]:
                    edges[i] -= nums[0]
                    if dfs(nums[1:], edges):
                        return True
                    edges[i] += nums[0]
            return False
        return dfs(nums, [numSum//4 for i in range(4)])
