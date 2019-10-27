**1239. Maximum Length of a Concatenated String with Unique Characters**

Given an array of strings arr. String s is a concatenation of a sub-sequence of arr which have **unique characters**.

Return _the maximum possible length_ of s.

 

**Example 1:**

**Input:** arr = ["un","iq","ue"]

**Output:** 4

**Explanation:** All possible concatenations are "","un","iq","ue","uniq" and "ique".

Maximum length is 4.

**Example 2:**

**Input:** arr = ["cha","r","act","ers"]

**Output:** 6

**Explanation:** Possible solutions are "chaers" and "acters".

**Example 3:**

**Input:** arr = ["abcdefghijklmnopqrstuvwxyz"]

**Output:** 26

 

**Constraints:**

- 1 &lt;= arr.length &lt;= 16
- 1 &lt;= arr[i].length &lt;= 26
- arr[i] contains only lower case English letters.
