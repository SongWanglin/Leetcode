31. Partition Array

Given an array nums of integers and an int k, partition the array (i.e move the elements in "nums") such that:

- All elements &lt; _k_ are moved to the _left_
- All elements &gt;= _k_ are moved to the _right_

Return the partitioning index, i.e the first index _i_ nums[_i_] &gt;= _k_.

Example

Example 1:

Input:

[],9

Output:

0

Example 2:

Input:

[3,2,2,1],2

Output:1

Explanation:

the real array is[1,2,2,3].So return 1

Challenge

Can you partition the array in-place and in O(n)?

Notice

You should do really partition in array _nums_ instead of just counting the numbers of integers smaller than k.

If all elements in _nums_ are smaller than _k_, then return _nums.length_
