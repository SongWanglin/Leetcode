**138. Copy List with Random Pointer**

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a [**deep copy**](https://en.wikipedia.org/wiki/Object_copying#Deep_copy) of the list.

**Example 1:**

**Input:**

{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}

**Explanation:**

Node 1's value is 1, both of its next and random pointer points to Node 2.

Node 2's value is 2, its next pointer points to null and its random pointer points to itself.

 

Hide Hint 1

Just iterate the linked list and create copies of the nodes on the go. Since a node can be referenced from multiple nodes due to the random pointers, make sure you are not making multiple copies of the same node.

Hide Hint 2

You may want to use extra space to keep **old node ---&gt; new node** mapping to prevent creating multiples copies of same node.

Hide Hint 3

We can avoid using extra space for old node ---&gt; new node mapping, by tweaking the original linked list. Simply interweave the nodes of the old and copied list. For e.g.

Old List: A --&gt; B --&gt; C --&gt; D

InterWeaved List: A --&gt; A' --&gt; B --&gt; B' --&gt; C --&gt; C' --&gt; D --&gt; D'

Hide Hint 4

The interweaving is done using **next** pointers and we can make use of interweaved structure to get the correct reference nodes for **random** pointers.
