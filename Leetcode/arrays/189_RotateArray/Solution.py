class Solution(object):
    def rotate(self, xs, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        k = k%len(xs)
        xs[0:len(xs)] = xs[0:len(xs)][::-1]
        xs[0:k] = xs[0:k][::-1]
        xs[k:] = xs[k:][::-1]
