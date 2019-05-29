public class No42_TrappingRainWater {
    public static int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int water = 0;
        for(int i=1;i<len;i++)
        {
            left[i] = Math.max(left[i-1],height[i-1]);
        }
        for(int i=len-2;i>=0;i--)
        {
            right[i] = Math.max(right[i+1],height[i+1]);
        }
        for(int i=0;i<len;i++)
        {
            water+= Math.max(Math.min(left[i],right[i]) - height[i], 0);
        }
        return water;
    }

    public static void main(String[] args)
    {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
