# Algorithm
Mincong is trying to learn basic algorithm at Leetcode.com. He'll start by the very begining and get through them step by step. There will be a list of accomplishments in the following paragraph.

## Check list
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
