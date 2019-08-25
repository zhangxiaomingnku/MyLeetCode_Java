public class No8_StringToIntegerAtoi {
    public static int myAtoi(String str) {
        int len = str.length();
        if (len <= 0)
            return 0;
        int i = 0;
        while (i < len) {
            if (str.charAt(i) == ' ') {
                i++;
                continue;
            }
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int j = i;
                long res = 0;
                while (j < len && str.charAt(j) >= 0 && str.charAt(j) <= 9) {
                    res = res * 10 + (str.charAt(j) - '0');
                    j++;
                }
                return res >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) res;
            } else if (str.charAt(i) == '-') {
                int j = i;
                long res = 0;
                while (j < len && str.charAt(j) >= 0 && str.charAt(j) <= 9) {
                    res = res * 10 + (str.charAt(j) - '0');
                    j++;
                }
                res = -res;
                return res <= Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) res;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        String nums = "42";
        System.out.println(myAtoi(nums));
    }
}
