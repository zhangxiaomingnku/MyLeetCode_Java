import java.util.Arrays;
import java.util.Stack;

public class No503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<2*n;i++)
        {
            int num = nums[i%n];
            while (!stack.empty() && num > nums[stack.peek()])
            {
                res[stack.pop()] = num;
            }
            if(i<n)
            {
                stack.add(i);
            }
        }
        return res;
    }
}
