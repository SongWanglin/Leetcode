class Solution:
    def addBinary(self, a: str, b: str) -> str:
        if not b:
            return a
        if not a:
            return b
        if a[-1]=='1' and b[-1]=='1':
            return self.addBinary(self.addBinary(a[0:-1], b[0:-1]), '1')+'0'
        elif a[-1]=='0' and b[-1]=='0':
            return self.addBinary(a[0:-1], b[0:-1])+'0'
        else:
            return self.addBinary(a[0:-1], b[0:-1])+'1'
