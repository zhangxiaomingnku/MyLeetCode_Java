public class No647_PalindromicSubstrings {
    public static int countSubstrings(String s) {
        if (s == null)
            return 0;
        int len = s.length();
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (j - i == 1)
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 1 : 0;
                else
                    dp[i][j] = (s.charAt(i) == s.charAt(j))
                            && (dp[i + 1][j - 1] == 1) ? 1 : 0;
            }
        }

        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dp[i][j] == 1)
                    sum++;
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(countSubstrings("aaa"));

    }
}
