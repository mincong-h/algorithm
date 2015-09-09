# Algorithm
Mincong is trying to learn basic algorithm at Leetcode.com. He'll start by the very begining and get through them step by step. There will be a list of accomplishments in the following paragraph.

## Check list
1. Hash table

## Notes
### Hash table
**O(1) runtime**  
From the API doc of [`Hashtable`](https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html), 
we know that hashtable provides constant-time performance for the basic operations (get and put), 
assuming the hash function disperses the elements properly among the buckets.
Since containsKey() is just a get() that throws away the retrieved value, it's O(1) (assuming the hash 
function works properly, again).
