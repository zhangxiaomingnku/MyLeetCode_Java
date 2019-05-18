public class No32_LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        return Math.max(cal(chars, 0, s.length(), '(', 1),
                cal(chars, s.length() - 1, -1, ')', -1));
    }

    private static int cal(char[] chars, int start, int end, char tmpChar, int flag) {
        int sum = 0;
        int max = 0;
        int curLen = 0;
        int vailLen = 0;
        for (int i = start; i != end; i = i + flag) {
            sum += chars[i] == tmpChar ? 1 : -1;
            curLen++;
            if (sum < 0) {
                max = max > vailLen ? max : vailLen;
                curLen = 0;
                sum = 0;
                vailLen = 0;
            } else if (sum == 0) {
                vailLen = curLen;
            }
        }
        return max > vailLen ? max : vailLen;
    }

    public static void main(String[] args) {
        String s = "((()()))";
        System.out.println(longestValidParentheses(s));
    }
}
