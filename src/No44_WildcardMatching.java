public class No44_WildcardMatching {
    public static boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;

        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                char ch = p.charAt(j - 1);
                if (ch == '*') {
                    dp[i][j] = j == 1 || dp[i][j - 1] || i > 0 && (dp[i - 1][j - 1] || dp[i - 1][j]);

                } else {
                    dp[i][j] = i > 0 && (ch == s.charAt(i - 1)
                            || ch == '?') && dp[i - 1][j - 1];

                }

            }
        }

        return dp[s.length()][p.length()];

    }

    public static void main(String[] args) {
        System.out.println(isMatch("adceb", "*a*b"));
    }


}
