class Solution:
    def maxSubarraySumCircular(self, arr: List[int]) -> int:
        total, n = sum(arr), len(arr)
        if(min(arr)>=0): return total
        if(max(arr)<0):  return max(arr)
        max_so_far = max_ending_here = min_so_far = min_ending_here = arr[0]
        for i in range(1, n):
            max_ending_here = max(arr[i], max_ending_here+arr[i])
            max_so_far = max(max_so_far, max_ending_here)
            min_ending_here = min(arr[i], min_ending_here+arr[i])
            min_so_far = min(min_so_far, min_ending_here)
        return max(max_so_far, total-min_so_far)
