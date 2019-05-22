import java.util.ArrayList;
import java.util.List;

public class No202_HappyNumber {
    static List<Integer> list = new ArrayList<>();

    public static boolean isHappy(int n) {

        while (true) {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (list.contains(sum)) {
                return false;
            } else if (sum == 1) {
                return true;
            } else {
                list.add(sum);
                n = sum;
            }
        }
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(isHappy(n));
    }

}
