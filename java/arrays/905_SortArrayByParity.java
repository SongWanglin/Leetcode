{\rtf1\ansi\ansicpg1252\cocoartf1671\cocoasubrtf200
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Solution \{\
    public int[] sortArrayByParity(int[] A) \{\
        int L = A.length;\
        int i = 0, j = L-1;\
        int result[] = new int[L];\
        for (int k=0; k<A.length; k++)\{\
            if(A[k]%2==0)\{\
                result[i] = A[k]; i++;\
            \}else\{\
                result[j] = A[k]; j--;\
            \}\
        \}\
        return result;\
    \}\
\}}