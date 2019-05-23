public class No739_DailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        int[] stack = new int[T.length];
        int bottom = 0;
        for (int i = 0; i < T.length; i++) {
            if (bottom == 0) {
                bottom++;
                stack[bottom] = i;
            } else {
                while (true) {
                    int stackIndex = stack[bottom];
                    if ((T[i] <= T[stackIndex]) || (bottom == 0)) {
                        break;
                    }
                    res[stackIndex] = i - stackIndex;
                    bottom--;
                }
                bottom++;
                stack[bottom] = i;
            }

        }
        for (; bottom > 0; bottom--) {
            res[stack[bottom]] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for (int num : res)
        {
            System.out.println(num);
        }
    }
}
