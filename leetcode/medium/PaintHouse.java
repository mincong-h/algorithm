public class Solution {

    public int minCost(int[][] costs) {

        if (costs == null || costs.length == 0) {
            return 0;
        }

        int costR = 0;
        int costB = 0;
        int costG = 0;

        for (int i = 0; i < costs.length; i++) {
            int prevR = costR;
            int prevB = costB;
            int prevG = costG;
            costR = Math.min(prevB, prevG) + costs[i][0];
            costB = Math.min(prevR, prevG) + costs[i][1];
            costG = Math.min(prevR, prevB) + costs[i][2];
        }
        return Math.min(costR, Math.min(costB, costG));
    }
}
