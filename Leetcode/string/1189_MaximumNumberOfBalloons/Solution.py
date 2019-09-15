class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        return 0 if len(text)<len("balloon") else min(min(map(text.count, "ban")), min(map(text.count, "lloo"))//2)
