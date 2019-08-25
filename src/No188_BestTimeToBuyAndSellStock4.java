class No188_BestTimeToBuyAndSellStock4 {
    public int maxProfit(int k, int[] prices) {
        if(k<=0)
            return 0;
        if(k>prices.length/2)
            return greedy(prices);
           int[][] dp = new int[k][2];
           //0代表第i次交易买入 1代表第i次交易卖出
           for(int i= 0;i<k;i++)
           {
               dp[i][0] = Integer.MIN_VALUE;
           }
           for(int p:prices)
           {
               dp[0][0] = Math.max(dp[0][0], -p);
               dp[0][1] = Math.max(dp[0][1],dp[0][0]+p);
               for(int i=1;i<k;i++)
               {
                   dp[i][0] = Math.max(dp[i][0], dp[i-1][1]-p);
                  dp[i][1] = Math.max(dp[i][1],dp[i][0]+p);   
               }
           }
           return dp[k-1][1];
       }
       
        private int greedy(int[] prices) {
           int max = 0;
           for(int i = 1; i < prices.length; ++i) {
               if(prices[i] > prices[i-1])
                   max += prices[i] - prices[i-1];
           }
           return max;
       }
}