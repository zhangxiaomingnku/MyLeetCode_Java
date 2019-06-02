public class No309_BestTimeToBuyAndSellStockWithCooldown {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 0)
            return 0;
        int[][][] dp = new int[len][2][2];
        dp[0][0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0][0] = Math.max(dp[i - 1][1][0], dp[i - 1][0][0]);
            dp[i][1][0] = dp[i - 1][0][1] + prices[i];
            dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][0][0] - prices[i]);
        }
        return Math.max(dp[len - 1][0][0], dp[len - 1][1][0]);
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        System.out.println(maxProfit(prices));
    }

}
