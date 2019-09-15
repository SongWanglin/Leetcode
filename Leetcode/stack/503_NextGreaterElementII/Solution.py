class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        if n==0: return nums
        res = [-1]*n
        stack = []
        for i in range(2*n-1):
            while stack and nums[stack[-1]%n] < nums[i%n]:
                key = stack.pop()
                res[key] = nums[i%n]
            stack.append(i%n)
        return res
