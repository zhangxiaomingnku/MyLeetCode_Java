public class No213_HouseRobber2 {

    public static int rob(int[] nums) {
        int len = nums.length;
        if (len <= 0)
            return 0;
        if (len <= 2) {
            return len == 1 ? nums[0] : Math.max(nums[0], nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        int[] dp1 = new int[len];
        dp1[0] = nums[1];
        dp1[1] = Math.max(nums[1], nums[2]);

        for (int i = 2; i < len - 1; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        for (int i = 3; i < len; i++) {
            dp1[i-1] = Math.max(dp1[i - 2], dp1[i - 3] + nums[i]);
        }
        return Math.max(dp[len - 2],dp1[len-2]);
    }
    //另一种写法 节省一次遍历
    public int rob2(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        if(nums.length == 1) return nums[0];
        int len = nums.length;
        // 拿第一个不拿最后一个
        int[] dp1 = new int[len];
        dp1[0] = nums[0];
        dp1[1] = Math.max(dp1[0],dp1[1]);
        // 不拿第一个拿最后一个
        int[] dp2 = new int[len];
        dp2[0] = 0;
        dp2[1] = nums[1];
        for(int i = 2; i < nums.length; i++){
            dp1[i] = Math.max(nums[i]+dp1[i-2], dp1[i-1]);
            dp2[i] = Math.max(nums[i]+dp2[i-2], dp2[i-1]);
        }
        return Math.max(dp1[len-2], dp2[len-1]);
    }


    public static void main(String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
    }

}
