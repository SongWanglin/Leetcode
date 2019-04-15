
**941. Valid Mountain Array**

Given an array A of integers, return true if and only if it is a _valid mountain array_.

Recall that A is a mountain array if and only if:

- A.length &gt;= 3
- There exists some i with 0 &lt; i &lt; A.length - 1 such that:
    - A[0] &lt; A[1] &lt; ... A[i-1] &lt; A[i]
    - A[i] &gt; A[i+1] &gt; ... &gt; A[B.length - 1]

 

**Example 1:**

**Input: **[2,1]

**Output: **false

**Example 2:**

**Input: **[3,5,5]

**Output: **false

**Example 3:**

**Input: **[0,3,2,1]

**Output: **true

 

**Note:**

1. 0 &lt;= A.length &lt;= 10000
2. 0 &lt;= A[i] &lt;= 10000 
