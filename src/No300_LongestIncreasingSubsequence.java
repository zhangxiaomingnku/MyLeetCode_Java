public class No300_LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i] = 1;
        }
        if (nums.length <= 1)
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        for (int d : dp) {
            max = Math.max(max, d);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 7, 2};
        System.out.println(lengthOfLIS(nums));
    }

}
