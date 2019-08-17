# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        if not head: return None
        if not head.next: return TreeNode(head.val)
        slow, fast, prev = head, head, head
        while fast and fast.next:
            prev = slow
            fast = fast.next.next
            slow = slow.next
        res = TreeNode(slow.val)
        prev.next = None
        res.left = self.sortedListToBST(head)
        res.right = self.sortedListToBST(slow.next)
        return res
