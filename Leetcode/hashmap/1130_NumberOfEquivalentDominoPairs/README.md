**5130. Number of Equivalent Domino Pairs**

Given a list of dominoes, dominoes[i] = [a, b] is _equivalent_ to dominoes[j] = [c, d] if and only if either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.

Return the number of pairs (i, j) for which 0 &lt;= i &lt; j &lt; dominoes.length, and dominoes[i] is equivalent to dominoes[j].

 

**Example 1:**

**Input:** dominoes = [[1,2],[2,1],[3,4],[5,6]]

**Output:** 1

 

**Constraints:**

- 1 &lt;= dominoes.length &lt;= 40000
- 1 &lt;= dominoes[i][j] &lt;= 9
