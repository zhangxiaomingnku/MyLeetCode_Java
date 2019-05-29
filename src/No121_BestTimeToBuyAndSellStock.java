public class No121_BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int min = prices[0];
        int max = 0;

        for(int i=1;i<len;i++)
        {
           max = Math.max(max,prices[i] - min);
           min = Math.min(min,prices[i]);
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
