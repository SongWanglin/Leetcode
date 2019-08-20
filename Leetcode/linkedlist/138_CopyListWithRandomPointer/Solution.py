"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, next, random):
        self.val = val
        self.next = next
        self.random = random
"""
class Solution(object):
    def copyRandomList(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        if not head:
            return None
        p = head
        while p:
            node = Node(p.val, None, None)
            node.next = p.next
            p.next = node
            p = p.next.next
        p = head
        while p:
            if p.random:
                p.next.random = p.random.next
            p = p.next.next
        newhead = head.next
        pold = head
        pnew = newhead
        while pnew.next:
            pold.next = pnew.next
            pold = pold.next
            pnew.next = pold.next
            pnew = pnew.next
        pold.next = None
        pnew.next = None
        return newhead
