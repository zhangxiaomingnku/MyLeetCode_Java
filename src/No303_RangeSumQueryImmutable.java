public class No303_RangeSumQueryImmutable {

    private int[] sums;

    public No303_RangeSumQueryImmutable(int[] nums) {
        sums = new int[nums.length];
        if (nums.length == 0) {
            return;
        }
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] += sums[i - 1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        } else {
            return sums[j] - sums[i - 1];
        }
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};
        No303_RangeSumQueryImmutable testClass = new No303_RangeSumQueryImmutable(nums);
        System.out.println(testClass.sumRange(1,2));
    }


}
