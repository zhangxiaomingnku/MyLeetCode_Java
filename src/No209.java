class No209 {
    public static int minSubArrayLen(int s, int[] nums)
    {
        int l = 0,r = 0;
        int res = Integer.MAX_VALUE;
        if(nums.length<=0)
            return 0;
        int sum = 0;
        while (r < nums.length && l<nums.length)
        {
            while (sum<s && r<nums.length)
                sum+= nums[r++];
            while (sum>=s && l<r)
            {
                res = Math.min(res,r-l);
                sum -= nums[l++];
            }
        }
        return res  == Integer.MAX_VALUE? 0:res;
    }
}