public class No172_FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        if (n < 5)
            return 0;
        else
            return trailingZeroes(n / 5) + n / 5;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(trailingZeroes(n));
    }
}
