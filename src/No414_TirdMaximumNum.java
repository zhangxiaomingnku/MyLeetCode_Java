public class No414_TirdMaximumNum {
    public static int thirdMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] thirdMaxNum = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int flag = 0;
        boolean f = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE && f) {
                flag++;
                f = false;
            }
            if (nums[i] > thirdMaxNum[0]) {
                flag++;
                thirdMaxNum[2] = thirdMaxNum[1];
                thirdMaxNum[1] = thirdMaxNum[0];
                thirdMaxNum[0] = nums[i];
                continue;
            } else if (nums[i] > thirdMaxNum[1] && nums[i] < thirdMaxNum[0]) {
                flag++;
                thirdMaxNum[2] = thirdMaxNum[1];
                thirdMaxNum[1] = nums[i];
                continue;
            } else if (nums[i] > thirdMaxNum[2] && nums[i] < thirdMaxNum[1]) {
                flag++;
                thirdMaxNum[2] = nums[i];
            }
        }
        return flag >= 3 ? thirdMaxNum[2] : thirdMaxNum[0];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(thirdMax(nums));
    }
}
