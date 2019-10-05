class Solution:
    def countBits(self, num: int) -> List[int]:
        res = [0 for _ in range(num+1)]
        offset = 1
        ref = [1]
        for index in range(1, num+1):
            if offset*2 == index:
                offset *= 2
            ref.append(offset)
            res[index] = res[index-offset]+1
        print(ref)
        return res
