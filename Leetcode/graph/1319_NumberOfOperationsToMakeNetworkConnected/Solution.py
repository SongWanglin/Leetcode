class Solution(object):
    def makeConnected(self, n, connections):
        """
        :type n: int
        :type connections: List[List[int]]
        :rtype: int
        """
        predecessor = [i for i in range(n)]
        extra = 0
        def findAncestor(node):
            if predecessor[node]!=node:
                predecessor[node] = findAncestor(predecessor[node])
            return predecessor[node]
        def mergeGroup(node1, node2):
            if findAncestor(node1)==findAncestor(node2): return False
            predecessor[findAncestor(node1)] = predecessor[findAncestor(node2)]
            return True
        for con in connections:
            if mergeGroup(con[0], con[1])==False:
                extra += 1
        group = set()
        #print predecessor
        for i in range(n):
            group.add(findAncestor(i))
        return -1 if len(group)-1>extra else len(group)-1
