class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        k_cnt, cum_sum, cum_hash = 0, 0, {0:1}
        for num in nums:
            cum_sum += num
            k_cnt += cum_hash.get(cum_sum - k, 0)
            cum_hash[cum_sum] = cum_hash.get(cum_sum, 0) + 1
        return k_cnt
