import java.util.LinkedList;

public class No239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length<2)
            return nums;
        LinkedList<Integer> list = new LinkedList<>();
        int[] result = new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++)
        {
            while (!list.isEmpty() && nums[list.peekLast()]<=nums[i])
            {
                list.pollLast();
            }
            list.add(i);

            if(list.peek()<=i-k)
            {
                list.poll();
            }
            if(i-k+1>=0)
            {
                result[i-k+1] = nums[list.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] result = No239_SlidingWindowMaximum.maxSlidingWindow(nums,3);
        for(int num : result)
        {
            System.out.println(num);
        }
    }
}
