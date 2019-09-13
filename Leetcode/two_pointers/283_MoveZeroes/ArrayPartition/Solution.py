class Solution:
    """
    @param nums: The integer array you should partition
    @param k: An integer
    @return: The index after partition
    """
    def partitionArray(self, nums, k):
        # write your code here
        temp = list(filter(lambda x: x<k, nums))
        nums = temp + list(filter(lambda x: x>=k, nums))
        return len(temp)
