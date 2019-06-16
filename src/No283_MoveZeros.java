public class No283_MoveZeros {
    void moveZeroes(int[] nums) {
        int i = 0,j = 0;
        int numsSize = nums.length;
        for(i = 0 ; i < numsSize; i++)
        {
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j < numsSize)
        {
            nums[j++] = 0;
        }
    }
}
