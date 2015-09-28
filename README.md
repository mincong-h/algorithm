# Algorithm
Mincong is trying to learn basic algorithm at Leetcode.com. He'll start by the very begining and get through them step by step. There will be a list of accomplishments in the following paragraph.

## Check list
### Check list by questions

id  | pb | tag | runtime | rank | my code
---: | --- | :--- | ------: | ---: | :---:
83  | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | `linkedlist` | 284ms | 0.06% | [here]()
242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | `array` |340ms | 41.10% | [here]()
169 | [Majority Element](https://leetcode.com/problems/majority-element/) | `array` | 564ms | 98.40% | [here]()
70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | `math` | 200ms | 26.70% | [here]()
206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | `linkedlist` | 360ms | 93.79% | [here]()
202 | [Happy Number](https://leetcode.com/problems/happy-number/) | `hashtable` | 244ms | 27.80% | [here]()
258 | [Add Digits](https://leetcode.com/problems/add-digits/) | `math` | 256ms | 19.18% | [here](https://github.com/mincong-h/Algorithm/blob/master/src/com/leetcode/easy/AddDigits.java)
104 | [Maximun number of a binary tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | `tree` | 380ms | 83.97% | [here](https://github.com/mincong-h/Algorithm/blob/master/src/com/leetcode/easy/MaxDepth.java)
237 | [Delete node from a linked list](https://leetcode.com/problems/delete-node-in-a-linked-list/) | `linkedlist` | 288ms | 5.50% | [here](https://github.com/mincong-h/Algorithm/blob/master/src/com/leetcode/easy/DeleteNode.java)
283 | [Move zeroes](https://leetcode.com/problems/move-zeroes/) | `array` | - | - | [here](https://github.com/mincong-h/Algorithm/blob/master/src/com/leetcode/easy/MoveZeroes.java)
100 | [Same tree](https://leetcode.com/problems/same-tree/) | `tree` | 256ms | 10.08% | [here](https://github.com/mincong-h/Algorithm/blob/master/src/com/leetcode/easy/IsSameTree.java)
226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | `tree` | 248ms | 6.33% | [here]()
235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | `tree` | 456ms | 14.91% | [here]()
191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | `bit manipulation` | 216ms | 1.04% | [here]()
217 | [Contains Duplicate]() | `array` | 432ms | 38.01% | [here]()
171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | `math` | 344ms | 47.84% | [here]()
263 | [Ugly Number](https://leetcode.com/problems/ugly-number/) | `math` | 246ms | 15.46% | [here]()
231 | [Power of two](https://leetcode.com/problems/power-of-two/) | `math` | 228ms | 0.81% | [here]()
172 | [Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/) | `math` | 2ms | ? | [here]()
88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | `array` | 178ms | ? | [here]()



### Check list by types

1. Hash table
2. Palindrome
3. BinaryTree
   1. Depth
   2. Invert
   3. Binary Search Tree
      1. Lowest Common Ancestor

## TODO list
Here's another list to get better performance

1. Majority Element (id=169)

 
## Notes
Here're some imporant notes for Mincong to understand different data structures and  elegant solutions. Concerning informations related to solutions, please check the Java code directly.

### Hash table

operation | average | worst case
:-------- | :-----: | :--------:
Space     | O(n)    | O(n)
Search    | O(1)    | O(n)
Insert    | O(1)    | O(n)
Delete    | O(1)    | O(n)

**O(1) runtime**  
From the API doc of [`Hashtable`](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), 
we know that hashtable provides constant-time performance for the basic operations (get and put), 
assuming the hash function disperses the elements properly among the buckets.
Since containsKey() is just a get() that throws away the retrieved value, it's O(1) (assuming the hash 
function works properly, again).

###Binary tree
Before calculating the depth ou the height of a binary tree, we should know what is the depth and the height of a tree. Here's an explanation copied from [What is the difference between tree depth and height?](http://stackoverflow.com/questions/2603692/what-is-the-difference-between-tree-depth-and-height)  
<img src="https://raw.githubusercontent.com/mincong-h/Algorithm/master/terms_to_explain/tree_height_vs_depth.png" width="700" height="auto" alt="Tree's depth vs height">

####Binary tree's depth
>So, how to calculate the height of a binary tree?

Mincong started by the smallest tree. If it don't have child, then it's depth is 1. If it does have child, then it's depth is the deepest depth of its children plus 1. This method is actually a recursive method. For more informations, plus check my answer at `MaxDepth.java`. FYI, this class is used with `TreeNode.java`.

###String
####dealing String with array
Many questions ask us to handle different case in String, such as Palindrome, anagram. I used to handle them with hashtable(hashmap), but the solutions were not so efficient, due to features of hashtable. More informations can be found in §hashtable paragraph. Array could be a better solution in some cases. It can be sort using `Arrays.sort`, it can be iterated, etc. 

###Integer
>Way to get number of digits in an int?

`length = (int)(Math.log10(n) + 1);`

> How to get the separate digits of an int number?

```
int number; // = some int

while (number > 0) {
    print( number % 10);
    number = number / 10;
}
```