class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        lowest = prices[0]
        max_profit = 0
        for i in range(1, len(prices)):
            price = prices[i]
            profit = price - lowest
            if max_profit < profit:
                max_profit = profit
            if lowest > price:
                lowest = price
        return max_profit
