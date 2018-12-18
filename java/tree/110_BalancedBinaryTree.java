{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int getHeight(TreeNode root)\{\
        if (root == null) return 0;\
        int L = getHeight(root.left);\
        int R = getHeight(root.right);\
        if ( (L==-1)||(R==-1)||(Math.abs(L-R)>1) )\
            return -1;\
        return Math.max(L,R)+1;\
    \}\
    public boolean isBalanced(TreeNode root) \{\
        return getHeight(root)!=-1;\
    \}\
\}\
}