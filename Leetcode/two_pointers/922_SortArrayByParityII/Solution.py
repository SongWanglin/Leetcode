class Solution:
    def sortArrayByParityII(self, A: List[int]) -> List[int]:
        if not A: return A
        even, odd, length = 0, 1, len(A)
        while even<length and odd<length:
            while even < length and A[even]%2==0:
                even+=2
            while odd < length and A[odd]%2==1:
                odd+=2
            if odd<length and even<length:
                A[odd], A[even] = A[even], A[odd]
        return A
