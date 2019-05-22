public class No201_BitwiseAndOfNumbersRange {
    public static int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while (m != n) {
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        while (count > 0) {
            n = n << 1;
            count--;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }
}
