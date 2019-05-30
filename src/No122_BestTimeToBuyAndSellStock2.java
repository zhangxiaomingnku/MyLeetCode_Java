public class No122_BestTimeToBuyAndSellStock2 {
    public static int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 1; i < prices.length; i++) {
            max += (prices[i] - prices[i - 1]) > 0 ? (prices[i] - prices[i - 1]) : 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

}
