class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        n = len(letters)
        if n == 0:
            return None
        low = 0
        high = n
        mid = 0
        while low < high:
            mid = (high + low) // 2
            if letters[mid] > target:  high = mid
            else:   low = mid + 1
        return letters[low%n]
