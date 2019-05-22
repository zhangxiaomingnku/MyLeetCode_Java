public class No91_Decode_Ways {
    public static int numDecodings(String s) {
        if(s.length()<1 || s == "0")
            return 0;
        if(s.length()<=1)
            return 1;
        int len = s.length();
        int[] dp = new int[len+1];
        dp[0] = 1;
        for(int i = 0;i<len;i++)
        {
           dp[i+1] = s.charAt(i) == '0'? 0 : dp[i];
           if(i>0 && (s.charAt(i-1) =='1' || (s.charAt(i-1) == '2' && s.charAt(i) <= '6')))
            {
                dp[i+1] += dp[i-1];
            }
        }
        return dp[len];
    }

    public static void main(String[] args)
    {
        System.out.println(numDecodings("12"));
    }
}
