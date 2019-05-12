public class No171_ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        if (s.length() <= 0)
            return -1;
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char tmpChar = s.charAt(i);
            ans += (tmpChar - 'A' + 1) * Math.pow(26,(len - i - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "AAB";
        System.out.println(titleToNumber(s));
    }
}
