/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    if (prices.length == 0) {
        return 0;
    }
    let lowest = prices[0];
    let mProfit = 0;
    for (var i = 1; i < prices.length; i++) {
        let price = prices[i];
        let profit = price - lowest;
        if (mProfit < profit) {
            mProfit = profit;
        }
        if (lowest > price) {
            lowest = price;
        }
    }
    return mProfit;
};
