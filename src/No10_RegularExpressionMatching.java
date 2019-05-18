public class No10_RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (null == s && null == p)
            return true;
        if (null == s || null == p)
            return false;
        int sLen = s.length();
        int pLen = p.length();
        boolean dp[][] = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int i = 0; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2] || (i > 0 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')
                            && dp[i - 1][j]);
                } else {
                    dp[i][j] = i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && dp[i - 1][j - 1];
                }
            }
        }
        return dp[sLen][pLen];
    }

    public static void main(String[] args) {
        String s = "aaab";
        String t = "a*b";
        System.out.println(isMatch(s, t));
    }


}
