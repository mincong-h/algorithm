/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if (n === 0) {
        return 1;
    }
    const ways = [1, 1];
    for (let i = 2; i <= n; i++) {
        ways.push(ways[i - 1] + ways[i - 2]);
    }
    return ways[n];
};
