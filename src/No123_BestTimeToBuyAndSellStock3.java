public class No123_BestTimeToBuyAndSellStock3 {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int[][][] dp = new int[len + 1][2][3];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                for (int k = 2; k >= 0; k--) {
                    if (k == 2 && j == 0)
                        continue;
                    if (j > 0)
                        dp[i][j][k] = Math.max(prices[i] + dp[i + 1][0][k], dp[i + 1][1][k]);
                    else
                        dp[i][j][k] = Math.max(-prices[i] + dp[i + 1][1][k + 1], dp[i + 1][0][k]);
                }
            }
        }
        return dp[0][0][0];
    }

    public static void main(String[] args) {
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));
    }
}
