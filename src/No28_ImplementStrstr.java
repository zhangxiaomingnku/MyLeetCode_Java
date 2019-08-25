public class No28_ImplementStrstr {
    public static int strStr(String haystack, String needle) {

        int len1 = haystack.length();
        int len2 = needle.length();
        if(len1 == 0 && len2== 0)
            return 0;
        if(len2 == 0)
            return -1;
        for (int i = 0; i < len1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < len2 && (i + j) < len1; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == len2 - 1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "aaaaaa";
        String needle = "bba";
        System.out.println(strStr(haystack, needle));
    }
}
