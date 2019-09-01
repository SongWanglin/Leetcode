**1176. Diet Plan Performance**

A dieter consumes calories[i] calories on the i-th day.  For every consecutive sequence of kdays, they look at _T_, the total calories consumed during that sequence of k days:

- If T &lt; lower, they performed poorly on their diet and lose 1 point; 
- If T &gt; upper, they performed well on their diet and gain 1 point;
- Otherwise, they performed normally and there is no change in points.

Return the total number of points the dieter has after all calories.length days.

Note that: The total points could be negative.

 

**Example 1:**

**Input:** calories = [1,2,3,4,5], k = 1, lower = 3, upper = 3

**Output:** 0

**Explaination**: calories[0], calories[1] &lt; lower and calories[3], calories[4] &gt; upper, total points = 0.

**Example 2:**

**Input:** calories = [3,2], k = 2, lower = 0, upper = 1

**Output:** 1

**Explaination**: calories[0] + calories[1] &gt; upper, total points = 1.

**Example 3:**

**Input:** calories = [6,5,0,0], k = 2, lower = 1, upper = 5

**Output:** 0

**Explaination**: calories[0] + calories[1] &gt; upper, calories[2] + calories[3] &lt; lower, total points = 0.

 

**Constraints:**

- 1 &lt;= k &lt;= calories.length &lt;= 10^5
- 0 &lt;= calories[i] &lt;= 20000
- 0 &lt;= lower &lt;= upper
