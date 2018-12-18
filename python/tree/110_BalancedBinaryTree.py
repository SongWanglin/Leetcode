{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 # Definition for a binary tree node.\
# class TreeNode:\
#     def __init__(self, x):\
#         self.val = x\
#         self.left = None\
#         self.right = None\
\
class Solution(object):\
    def Depth(self, root):\
        if root is None: return 0; \
        L = self.Depth(root.left);\
        R = self.Depth(root.right);\
        if L==-1 or R==-1 or abs(L-R)>1: return -1;\
        return 1+max(L,R);\
    \
    def isBalanced(self, root):\
        """\
        :type root: TreeNode\
        :rtype: bool\
        """    \
        return self.Depth(root)!=-1;}