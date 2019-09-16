class Solution:
    def kConcatenationMaxSum(self, arr: List[int], k: int) -> int:
        def kadane(a, k):
            n = len(arr)
            max_so_far, max_ending_here = 0, 0
            for i in range(0, k*n):
                max_ending_here = max(a[i%n], max_ending_here+a[i%n])
                max_so_far = max(max_so_far, max_ending_here)
            return max_so_far
        total = sum(arr)
        if(min(arr)>=0): return total*k%(10**9+7)
        if(max(arr)<0):  return 0
        res = kadane(arr, 2)
        return max(res, total*(k-2)+res)%(10**9+7)
