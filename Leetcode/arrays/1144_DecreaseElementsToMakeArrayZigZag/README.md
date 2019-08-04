**1144. Decrease Elements To Make Array Zigzag**

Given an array nums of integers, a _move_ consists of choosing any element and **decreasing it by 1**.

An array A is a _zigzag array_ if either:

- Every even-indexed element is greater than adjacent elements, ie. A[0] &gt; A[1] &lt; A[2] &gt; A[3] &lt; A[4] &gt; ...
- OR, every odd-indexed element is greater than adjacent elements, ie. A[0] &lt; A[1] &gt; A[2] &lt; A[3] &gt; A[4] &lt; ...

Return the minimum number of moves to transform the given array nums into a zigzag array.

 

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 2

**Explanation:** We can decrease 2 to 0 or 3 to 1.

**Example 2:**

**Input:** nums = [9,6,1,6,2]

**Output:** 4

 

**Constraints:**

- 1 &lt;= nums.length &lt;= 1000
- 1 &lt;= nums[i] &lt;= 1000
