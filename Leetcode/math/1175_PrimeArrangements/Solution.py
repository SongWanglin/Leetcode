class Solution(object):
    def numPrimeArrangements(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n<=2:
            return 1
        primeCount = self.countPrimes(n+1)
        a = self.fac(primeCount)
        b = self.fac(n-primeCount)
        return a*b%1000000007

    def fac(self, n):
        return 1 if n<=1 else n*self.fac(n-1)

    def countPrimes(self, n):
        if n < 2:
            return 0
        s = [1] * n
        s[0] = s[1] = 0
        for i in range(2, int(n ** 0.5) + 1):
            if s[i] == 1:
                s[i * i:n:i] = [0] * len(s[i * i:n:i])
        return sum(s)
