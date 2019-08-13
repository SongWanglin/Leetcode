**1157. Online Majority Element In Subarray**

Implementing the class MajorityChecker, which has the following API:

- MajorityChecker(int[] arr) constructs an instance of MajorityChecker with the given array arr;
- int query(int left, int right, int threshold) has arguments such that:
    - 0 &lt;= left &lt;= right &lt; arr.lengthrepresenting a subarray of arr;
    - 2 * threshold &gt; right - left + 1, ie. the threshold is always a strict majority of the length of the subarray

Each query(...) returns the element in arr[left], arr[left+1], ..., arr[right]that occurs at least threshold times, or -1 if no such element exists.

 

**Example:**

MajorityChecker majorityChecker = new MajorityChecker([1,1,2,2,1,1]);

majorityChecker.query(0,5,4); // returns 1

majorityChecker.query(0,3,3); // returns -1

majorityChecker.query(2,3,2); // returns 2

 

**Constraints:**

- 1 &lt;= arr.length &lt;= 20000
- 1 &lt;= arr[i] &lt;= 20000
- For each query, 0 &lt;= left &lt;= right &lt; len(arr)
- For each query, 2 * threshold &gt; right - left + 1
- The number of queries is at most 10000