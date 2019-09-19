class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        stack = []
        for i in range(0, len(num)):
            ch = num[i]
            while stack and int(stack[-1]) > int(ch) and k>0:
                stack.pop()
                k -= 1
            stack.append(ch)
        while stack and k>0:
            stack.pop()
            k-=1
        while stack and stack[0]=='0':
            stack.pop(0)
        res = "".join(stack)
        return "0" if res=="" else res
