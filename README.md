# Algorithm

I'm learning algorithm at [LeetCode](https://leetcode.com) and [HackerRank](https://hackerrank.com).
This repo contains some techniques and the list of solutions. Solutions are
written as markdown files following the naming convention:

    leetcode/${id}.${name}.md

## CheckList

- Do you understand the question? Can you rephrase it?
- What is your strategy for the resolution?
- The estimation of time complexity and space complexity?
- Illustrate the solution steps using a simple example?
- Corner cases, are they being considered?
- Any ideas of further optimization? Saying it rather than writing it, because
  of time constraint, readability, or other reasons.

## Array

**Boyer–Moore majority vote algorithm.** Finding a majority element that occurs
≥ N/2 times. Done in O(N) runtime and O(1) space. See
<https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm>.

**Hash code of the array.** Returns a hash code based on the contents of the
specified array (overloaded methods: `boolean[]`, `byte[]`, `char[]`,
`double[]`, `float[]`, `int[]`, `long[]`, `Object[]`, `short[]`):

```java
java.util.Arrays.hashCode(int[] a);
```

**2 Pointers (Fast & Slow).** One slow pointer and one fast pointer. They both move forwards
at same speed unless in some cases, slow pointer needs to stop. This strategy
can be used to manipulate the array in place. Example: [LeetCode 27 Remove
Element](https://leetcode.com/problems/remove-element/).

**2 Pointers (Left & Right).** Left pointer moves right, right pointer moves
left. :warning: Make sure they stop at the right moment to avoid collapse.

**Find Max (Min).** Do not use sorting to find max or min values from an array.
This can be done using variables and in one iteration. Time complexity: O(N).

**Sorting.** Sometimes sorting is useful before addressing the real problem. It
enables the relationship between neighbour elements. The time complexity is O(N
log N).

## Priority Queue

**Kth Element.** Find the Kth largest or smallest element in a collection or
array. This can be done using a priority queue with K elements. If looking for
the Kth largest element, use a min heap, so that peek (poll) from the priority
queue returns the Kth element. If looking for the Kth smallest, use a max heap,
so that peek (poll) from the priority queue returns the Kth element.

Related problems:

- [215: Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
- [703. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
- [973: K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)

## Hash Table

**Use array as hash table.** If possible, use an array as the reference table
for finding the right element. Compared to any `Map` implementation, using array
is faster and consumes less memory. This is typically possible when the keys are
ASCII characters. You can create an array with 128 elements, for boolean status
(`boolean[]`), char count (`int[]`), etc.

```java
int[] counts = new int[128];
for (char c : word.toCharArray()) {
    counts[c]++;
}
```

Related problems:

- [771: Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/)

**Use Hashtable to Store References.** Use hashtable to store the target
references. It helps to reduce cost for lookup operation, compared to double
for-loop.

Related problems:

- [1: Two Sum](https://leetcode.com/problems/two-sum/)
- [560: Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

## Linked List

**2 pointers.** One slow pointer (1x speed) and one fast pointer (2x speed). It
allows to resolve circular issue, because the faster one will be 1 round faster
after some moves.

**Changing "next" reference.** In sinlge linked list, changing the reference of the
"next" node can be useful for some operations, such as reversing the list.
Here is an illustration:

```
Input:   1 -> 2 -> 3 -> 4 -> 5
Output:  1 <- 2 <- 3 <- 4 <- 5
```

Related problems:

- [92: Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
- [206: Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)

## String

**Two Pointers.** Use two pointers L, R for switching characters.

Related problems:

- [344: Reverse String](https://leetcode.com/problems/reverse-string/)

**Permutation in String.** Maintain a sliding window `[L, R]` in the string, use
two variables: `int[] stock` and `int todo` to record respectively what are the
remaining characters available for permutation as ASCII table, and the remaining
number of characters to do to have a match.

- When R (right pointer) moves forward, it consumes more chars from the stock
  table.
- When L (left pointer) moves forward, it recover the consumed chars from the
  stock table.

Related problems:

- [3: Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
- [76: Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
- [438: Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
- [567: Permutation in String](https://leetcode.com/problems/permutation-in-string/)

**String construction.** When resolving exercises, it's better to use
[`java.lang.StringBuilder`](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
rather than string concatenation using `+`. Even better, use char array `char[]`
and fill it manually, which is efficient and allows navigation.

Constructor | Description
:--- | :---
`StringBuilder()` | Constructor without additional arguments
`StringBuilder(String)` | Constructor with an initial string
`StringBuilder(int)` | Constructor with initial capacity
`String(char[])` | Constructor with a char array
`String(char[], int, int)` | Constructor with offset and length

## Bit Manipulation

**Power of Two.** An integer is power of two if it is positive and has only one
bit.

   N | Binary
---: | :---------------------:
   1 | ... 0000 0000 0000 0001
   2 | ... 0000 0000 0000 0010
   4 | ... 0000 0000 0000 0100
   8 | ... 0000 0000 0000 1000
  16 | ... 0000 0000 0001 0000

## Number

**Enrich Integer Via Bits.** You can provide additional information to an
integer by using the unused bits. This is possible when integer is served as an
emumerate value, e.g. only using 0 as false and 1 as true. This strategy is
useful when you need to do something in-place, or you are not allowed to use
more complex data structure.

Related problems:

- [289: Game of Life](https://leetcode.com/problems/game-of-life/)

## Useful APIs

Useful APIs in Java.

Method | Description
:----- | :----------
[`String(char[] value, int offset, int count): String`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#String-char:A-int-int-) | String constructor, useful for creating a string from a char array.
[`String#substring(int beginIndex, int endIndex): String`](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) | Extracts a substring from string.

## Corner Cases

TreeNode:

- Can `root` be `null`?

Integer:

- Boundaries: `Integer.MIN_VALUE` and `Integer.MAX_VALUE` good boundaries?
  Comparison will fail when the integer itself is one of these values.
- Risk of overflow?
- Average for sum of two integers: prefer `start + (end - start) / 2` rather
  than `(start + end) / 2`, so that the overflow problem can be avoided.
- Integer division: when both dividend and divisor are integer, the
  quotient will be an integer too. For example, `3 / 2 = 1`. In order to have
  an accurate result, you need to ensure either divident or divisor to be a
  float or a double.

Array:

- Can array be null?
- The length of the array?
- Subarray: how to define subarray, at least 1 item or 2 items?

2D Array:

- Coordinate (x, y) or (i, j): which position is (0, 0), what direction is the
  axes? It's easy to draw diagram on whitebroad using (x, y) like in Math. But
  in the program, it's easier to use (i, j).

Comparator:

- Compare one field after another, if one field is different, compute the diff
  and return the result. Only when this field is equal on both instances, you
  can pass to the next field. Be careful about problem
  ["Comparison method violates its general contract!"](https://stackoverflow.com/questions/8327514/)

## HackerRank

Too lazy to add :see_no_evil:

## LeetCode

Id  | Problem | Runtime (Java)
---: | --- | ---:
1 | [Two Sum](https://leetcode.com/problems/two-sum/) | 2ms
2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | 2ms
3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | 14ms
5 | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) | 16ms
7 | [Reverse Integer](https://leetcode.com/problems/reverse-integer/) | 1ms
9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | 7ms
11 | [Max Area](https://leetcode.com/problems/container-with-most-water/) | 1ms
12 | [Integer to roman][12] | 7ms
13 | [Roman to Integer][13] | 5ms
14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) | 4ms
15 | [3Sum](https://leetcode.com/problems/3sum/) | 39ms
17 | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | 0ms
19 | [Remove Nth Node From End of List][19] | 16ms
20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | 4ms
21 | [Merge two sorted lists](https://leetcode.com/problems/merge-two-sorted-lists/) | 5ms
22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | 0ms
23 | [Merge k sorted lists][23] | 23ms
26 | [Remove Duplicates From Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | 1ms
27 | [Remove Element](https://leetcode.com/problems/remove-element/) | 0ms
28 | [Implement strStr()](https://leetcode.com/problems/implement-strstr/) | 2ms
33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | 0ms
34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | 0ms
35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) | 0ms
36 | [Valid sudoku][36] | 7ms
38 | [Count and say][38] | 4ms
39 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | 5ms
40 | [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) | 4ms
46 | [Permutations](https://leetcode.com/problems/permutations/) | 3ms
47 | [Permutations II](https://leetcode.com/problems/permutations-ii/) | 1ms
48 | [Rotate Image](https://leetcode.com/problems/rotate-image/) | 0ms
49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | 12ms
50 | [Pow x-n][50] | 26ms
53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | 0ms
54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) | 0ms
56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | 7ms
58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | 0ms
62 | [Unique Paths](https://leetcode.com/problems/unique-paths/) | 0ms
64 | [Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/) | 2ms
65 | [Valid Number](https://leetcode.com/problems/valid-number/) | 1ms
66 | [Plus One](https://leetcode.com/problems/plus-one/) | 0ms
67 | [Add Binary](https://leetcode.com/problems/add-binary/) | 1ms
70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | 2ms
75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | 0ms
76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | 5ms
77 | [Combinations](https://leetcode.com/problems/combinations/) | 2ms
78 | [Subsets](https://leetcode.com/problems/subsets/) | 1ms
79 | [Word Search](https://leetcode.com/problems/word-search/) | 4ms
83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | 0ms
86 | [Partition List](https://leetcode.com/problems/partition-list/) | 0ms
88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | 2ms
90 | [Subsets II](https://leetcode.com/problems/subsets-ii/) | 1ms
92 | [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/) | 0ms
94 | [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | 0ms
98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | 0ms
100 | [Same Tree](https://leetcode.com/problems/same-tree/) | 1ms
101 | [Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | 5ms
102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | 1ms
103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/) | 1ms
104 | [Maximun Depth of a Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | 0ms
107 | [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/) | 1ms
108 | [Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | 0ms
110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) | 1ms
111 | [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | 0ms
112 | [Path Sum](https://leetcode.com/problems/path-sum/) | 0ms
113 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/) | 1ms
118 | [Pascal Triangle](https://leetcode.com/problems/pascals-triangle/) | 0ms
119 | [Pascal triangle II][119] | 2ms
121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | 1ms
122 | [Best time to buy and sell stock II][122] | 2ms
125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | 2ms
136 | [Single Number](https://leetcode.com/problems/single-number/) | 0ms
139 | [Word Break][139] | 12ms
141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | 0ms
144 | [Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/) | 0ms
146 | [LRU Cache][146] | 16ms
151 | [Reverse words in a string][151] | 7ms
153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | 0ms
155 | [Min Stack](https://leetcode.com/problems/min-stack/) | 47ms
160 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | 1ms
162 | [Find Peak Element][162] | 1ms
163 | [Missing ranges][163] | 13ms
165 | [Compare Version Numbers][165] | 4ms
167 | [Two Sum II - Input array is sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | 0ms
168 | [Excel sheet column title][168] | 0ms
169 | [Majority Element](https://leetcode.com/problems/majority-element/) | 3ms
171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | 1ms
172 | [Factorial Trailing Zeroes][172] | 2ms
179 | [Largest Number](https://leetcode.com/problems/largest-number/) | 3ms
186 | [Reverse Words in a String II][186] | 3ms
189 | [Rotate array][189] | 1ms
190 | [Reverse Bits](https://leetcode.com/problems/reverse-bits/) | 1ms
191 | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) | 0ms
195 | [Tenth line][195] | 15ms
198 | [House Robber](https://leetcode.com/problems/house-robber/) | 0ms
199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | 1ms
200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | 1ms
202 | [Happy Number](https://leetcode.com/problems/happy-number/) | 1ms
203 | [Remove linked list elements][203] | 2ms
204 | [Count Primes][204] | 32ms
205 | [Isomorphic strings][205] | 50ms
206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | 0ms
215 | [Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | 4ms
217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | 9ms
219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | 8ms
222 | [Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/) | 1ms
225 | [Implement Stack Using Queues](https://leetcode.com/problems/implement-stack-using-queues/) | 45ms
226 | [Invert Binary Tree][226] | 0ms
228 | [Summary ranges][228] | 0ms
231 | [Power of Two](https://leetcode.com/problems/power-of-two/) | 1ms
232 | [Implement Queue Using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | 42ms
234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | 1ms
235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | 4ms
236 | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/) | 5ms
237 | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/) | 0ms
238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | 1ms
240 | [Search a 2D matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | 13ms
242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | 4ms
243 | [Shortest Word Distance](https://leetcode.com/problems/shortest-word-distance/) | 1ms
244 | [Shortest word distence II][244] | 27ms
245 | [Shortest word distance III][245] | 6ms
246 | [Strobogrammatic Number](https://leetcode.com/problems/strobogrammatic-number/) | 0ms
252 | [Meeting rooms][252] | 13ms
253 | [Meeting rooms][253] | 19ms
256 | [Paint House](https://leetcode.com/problems/paint-house/) | 1ms
257 | [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/) | 7ms
258 | [Add Digits](https://leetcode.com/problems/add-digits/) | 1ms
260 | [Single number III][260] | 10ms
263 | [Ugly Number](https://leetcode.com/problems/ugly-number/) | 1ms
266 | [Palindrome permutation][266] | 1ms
268 | [Missing Number](https://leetcode.com/problems/missing-number/) | 0ms
270 | [Closest Binary Search Tree Value](https://leetcode.com/problems/closest-binary-search-tree-value/) | 0ms
271 | [Encode and decode strings][271] | 15ms
274 | [H-Index][274] | 3ms
278 | [First Bad Version](https://leetcode.com/problems/first-bad-version/) | 10ms
279 | [Perfect squares][279] | 58ms
280 | [Wiggle sort][280] | 1ms
283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | 1ms
288 | [Unique word abbreviation][288] | 79ms
289 | [Game of Life](https://leetcode.com/problems/game-of-life/) | 0ms
293 | [Flip game][293] | 1ms
297 | [Serialize and Deserialize Binary Tree][297] | 23ms
298 | [Binary tree longest consecuritve sequence][298] | 3ms
303 | [Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) | 52ms
311 | [Sparse Matrix Multiplication](https://leetcode.com/problems/sparse-matrix-multiplication/) | 0ms
318 | [Maximum product of word lengths][318] | 71ms
320 | [Generalized abbreviation][320] | 21ms
326 | [Power of Three][326] | 21ms
332 | [Reconstruct Itinerary](https://leetcode.com/problems/reconstruct-itinerary/) | 36ms
338 | [Counting Bits](https://leetcode.com/problems/counting-bits/) | 1ms
342 | [Power of Four](https://leetcode.com/problems/power-of-four/) | 1ms
343 | [Integer break][343] | 0ms
344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | 1ms
345 | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | 2ms
346 | [Moving Average From Data Stream](https://leetcode.com/problems/moving-average-from-data-stream/) | 69ms
347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | 10ms
349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | 2ms
350 | [Intersection of two arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | 2ms
351 | [Android unlock pattern][351] | 13ms
357 | [Count numbers with unique digits][357] | 0ms
359 | [Logger rate limiter][359] | 187ms
360 | [Sort transformed array][360] | 1ms
367 | [Valid perfect square](https://leetcode.com/problems/valid-perfect-square/) | 400ms
369 | [Plus one linked list][369] | 1ms
374 | [Guess number higher or lower][374] | 2ms
382 | [Linked list random node][382] | 146ms
383 | [Ransom note][383] | 18ms
387 | [First Unique Character in a String][387] | 31ms
388 | [Longest absolute file path][388] | 6ms
389 | [Find the difference][389] | 9ms
392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | 0ms
394 | [Decode String](https://leetcode.com/problems/decode-string/) | 0ms
398 | [Find the Difference](https://leetcode.com/problems/find-the-difference/) | 1ms
400 | [Nth Digit][400] | 7ms
401 | [Binary watch][401] | 1ms
402 | [Remove K digits][402] | 29ms
404 | [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/) | 3ms
405 | [Convert a Number to Hexadecimal](https://leetcode.com/problems/convert-a-number-to-hexadecimal/) | 0ms
406 | [Queue reconstruction by height][406] | 15ms
408 | [Valid Word Abbreviation][408] | 22ms
409 | [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/) | 2ms
412 | [Fizz Buzz](https://leetcode.com/problems/fizz-buzz/) | 1ms
414 | [Third Maximum Number][414] | 6ms
415 | [Add Strings](https://leetcode.com/problems/add-strings/) | 9ms
429 | [N-ary Tree Level Order Traveral](https://leetcode.com/problems/n-ary-tree-level-order-traversal/) | 4ms
437 | [Path Sum III](https://leetcode.com/problems/path-sum-iii/) | 6ms
438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | 9ms
443 | [String Compression](https://leetcode.com/problems/string-compression/) | 1ms
448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | 6ms
451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | 6ms
461 | [Hamming Distance](https://leetcode.com/problems/hamming-distance/) | 0ms
463 | [Island Perimeter](https://leetcode.com/problems/island-perimeter/) | 53ms
476 | [Number Complement](https://leetcode.com/problems/number-complement/) | 5ms
482 | [License Key Formatting](https://leetcode.com/problems/license-key-formatting/) | 8ms
485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | 4ms
500 | [Keyboard Row](https://leetcode.com/problems/keyboard-row/) | 1ms
509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | 12ms
520 | [Detect Capital](https://leetcode.com/problems/detect-capital/) | 14ms
541 | [Reverse String II](https://leetcode.com/problems/reverse-string-ii/) | 2ms
543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | 0ms
559 | [Maximum Depth of N-ary Tree](https://leetcode.com/problems/maximum-depth-of-n-ary-tree/) | 2ms
557 | [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/) | 5ms
560 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | 12ms
561 | [Array Partition I](https://leetcode.com/problems/array-partition-i/) | 20ms
572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/) | 6ms
576 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | 7ms
581 | [Shortest Unsorted Continuous Subarray](https://leetcode.com/problems/shortest-unsorted-continuous-subarray/submissions/) | 8ms
589 | [N-ary Tree Preorder Traversal](https://leetcode.com/problems/n-ary-tree-preorder-traversal/) | 8ms
590 | [N-ary Tree Postorder Traversal](https://leetcode.com/problems/n-ary-tree-postorder-traversal/) | 4ms
595 | [Big Countries](https://leetcode.com/problems/big-countries/) | 1672ms
606 | [Construct String from Binary Tree](https://leetcode.com/problems/construct-string-from-binary-tree/) | 12ms
617 | [Merge Two Binary Tree][617] | 6ms
623 | [Add One Row to Tree](https://leetcode.com/problems/add-one-row-to-tree/) | 4ms
637 | [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/) | 2ms
647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/) | 1ms
654 | [Maximum Binary Tree](https://leetcode.com/problems/maximum-binary-tree/) | 6ms
657 | [Robot returns to Origin](https://leetcode.com/problems/robot-return-to-origin/) | 9ms
674 | [Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/) | 2ms
680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | 7ms
682 | [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/) | 3ms
693 | [Binary Number with Alternating Bits](https://leetcode.com/problems/binary-number-with-alternating-bits/) | 0ms
700 | [Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/) | 2ms
703 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) | 62ms
709 | [To Lower Case][709] | 0ms
719 | [Max Stack](https://leetcode.com/problems/max-stack/) | 89ms
746 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) | 1ms
771 | [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) | 0ms
784 | [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/) | 1ms
790 | [Rotate String](https://leetcode.com/problems/rotate-string/submissions/) | 0ms
804 | [Unique Morse Code Words](https://leetcode.com/problems/unique-morse-code-words/) | 4ms
821 | [Shortest Distance to a Character](https://leetcode.com/problems/shortest-distance-to-a-character/) | 4ms
832 | [Flipping an Image](https://leetcode.com/problems/flipping-an-image/) | 0ms
844 | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) | 0ms
872 | [Leaf-Similar Trees](https://leetcode.com/problems/leaf-similar-trees/) | 0ms
876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | 1ms
890 | [Find and Replace Pattern](https://leetcode.com/problems/find-and-replace-pattern/) | 2ms
891 | [Most Common Word](https://leetcode.com/problems/most-common-word/) | 4ms
896 | [Monotonic Array](https://leetcode.com/problems/monotonic-array/) | 12ms
905 | [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | 12ms
916 | [Word Subsets](https://leetcode.com/problems/word-subsets/submissions/) | 23ms
917 | [Reverse Only Letters](https://leetcode.com/problems/reverse-only-letters/) | 3ms
922 | [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/) | 4ms
925 | [Long Pressed Name](https://leetcode.com/problems/long-pressed-name/) | 3ms
929 | [Unique Email Addresses](https://leetcode.com/problems/unique-email-addresses/) | 10ms
931 | [Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/) | 3ms
938 | [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/) | 0ms
953 | [Verifying an Alien Dictionary](https://leetcode.com/problems/verifying-an-alien-dictionary/) | 3ms
961 | [N-Repeated Element in Size 2N Array](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/) | 4ms
965 | [Univalued Binary Tree](https://leetcode.com/problems/univalued-binary-tree/) | 3ms
973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) | 20ms
977 | [Squares of a sorted array](https://leetcode.com/problems/squares-of-a-sorted-array/) | 20ms
1002 | [Find Common Characters](https://leetcode.com/problems/find-common-characters/) | 2ms
1013 | [Partition Array Into Three Parts With Equal Sum](https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/) | 1ms

## References

- Oracle, _"String (Java Platform SE 8)"_, Oracle Documentation, 2019.
  <https://docs.oracle.com/javase/8/docs/api/java/lang/String.html>

[12]: https://leetcode.com/problems/integer-to-roman/
[13]: https://leetcode.com/problems/roman-to-integer/
[19]: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
[23]: https://leetcode.com/problems/merge-k-sorted-lists/
[36]: https://leetcode.com/problems/valid-sudoku/
[38]: https://leetcode.com/problems/count-and-say/
[50]: https://leetcode.com/problems/powx-n/
[58]: https://leetcode.com/problems/length-of-last-word/
[66]: https://leetcode.com/problems/plus-one/
[94]: https://leetcode.com/problems/binary-tree-inorder-traversal/
[119]: https://leetcode.com/problems/pascals-triangle-ii/
[122]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
[139]: https://leetcode.com/problems/word-break/
[146]: https://leetcode.com/problems/lru-cache/
[151]: https://leetcode.com/problems/reverse-words-in-a-string/
[162]: https://leetcode.com/problems/find-peak-element/
[163]: https://leetcode.com/problems/missing-ranges/
[165]: https://leetcode.com/problems/compare-version-numbers/
[168]: https://leetcode.com/problems/excel-sheet-column-title/
[172]: https://leetcode.com/problems/factorial-trailing-zeroes/
[186]: https://leetcode.com/problems/reverse-words-in-a-string-ii/
[189]: https://leetcode.com/problems/rotate-array/
[195]: https://leetcode.com/problems/tenth-line/
[203]: https://leetcode.com/problems/remove-linked-list-elements/
[204]: https://leetcode.com/problems/count-primes/
[205]: https://leetcode.com/problems/isomorphic-strings/
[206]: https://leetcode.com/problems/reverse-linked-list/
[225]: https://leetcode.com/problems/implement-stack-using-queues/
[226]: https://leetcode.com/problems/invert-binary-tree/
[228]: https://leetcode.com/problems/summary-ranges/
[240]: https://leetcode.com/problems/search-a-2d-matrix-ii/
[244]: https://leetcode.com/problems/shortest-word-distance-ii/
[245]: https://leetcode.com/problems/shortest-word-distance-iii/
[252]: https://leetcode.com/problems/meeting-rooms/
[253]: https://leetcode.com/problems/meeting-rooms-ii/
[260]: https://leetcode.com/problems/single-number-iii/
[266]: https://leetcode.com/problems/palindrome-permutation/
[270]: https://leetcode.com/problems/closest-binary-search-tree-value/
[271]: https://leetcode.com/problems/encode-and-decode-strings/
[274]: https://leetcode.com/problems/h-index/
[279]: https://leetcode.com/problems/perfect-squares/
[280]: https://leetcode.com/problems/wiggle-sort/
[288]: https://leetcode.com/problems/unique-word-abbreviation/
[293]: https://leetcode.com/problems/flip-game/
[297]: https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
[298]: https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/
[318]: https://leetcode.com/problems/maximum-product-of-word-lengths/
[320]: https://leetcode.com/problems/generalized-abbreviation/
[326]: https://leetcode.com/problems/power-of-three/
[343]: https://leetcode.com/problems/integer-break/
[351]: https://leetcode.com/problems/android-unlock-patterns/
[357]: https://leetcode.com/problems/count-numbers-with-unique-digits/
[359]: https://leetcode.com/problems/logger-rate-limiter/
[360]: https://leetcode.com/problems/sort-transformed-array/
[369]: https://leetcode.com/problems/plus-one-linked-list/
[374]: https://leetcode.com/problems/guess-number-higher-or-lower/
[382]: https://leetcode.com/problems/linked-list-random-node/
[383]: https://leetcode.com/problems/ransom-note/
[387]: https://leetcode.com/problems/first-unique-character-in-a-string/
[388]: https://leetcode.com/problems/longest-absolute-file-path/
[389]: https://leetcode.com/problems/find-the-difference/
[400]: https://leetcode.com/problems/nth-digit/
[401]: https://leetcode.com/problems/binary-watch/
[402]: https://leetcode.com/problems/remove-k-digits/
[406]: https://leetcode.com/problems/queue-reconstruction-by-height/
[408]: https://leetcode.com/problems/valid-word-abbreviation/
[414]: https://leetcode.com/problems/third-maximum-number/
[617]: https://leetcode.com/problems/merge-two-binary-trees/
[709]: https://leetcode.com/problems/to-lower-case/
