class Solution:
    def deckRevealedIncreasing(self, deck):
        """
        :type deck: List[int]
        :rtype: List[int]
        """
        deck.sort()
        res = [deck.pop()]
        while deck:
            res = [deck.pop(), res.pop()] + res
        return res
