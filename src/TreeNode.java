public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public int minNumberInRotateArray(int [] array) {
        int len = array.length;
        if(len == 0)
            return 0;
        int low = 0, high = len - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }

    public static int minNumberInRotateArray1(int [] array) {
        if(array==null || array.length == 0) return 0;
        int p1 = 0;
        int p2 =array.length -1;
        int mid = (p2+p1)/2;
        if(array[p1]==array[p2] && array[p1]==array[mid]){
            int ans = array[p1];
            for(int i =p1;i<=p2;i++){
                if(array[i]<ans) ans = array[i];
            }
            return ans;
        }
        if(array[0]<array[p2]) return array[0];
        while(p2 != (p1+1)){
            mid = (p2+p1)/2;
            if(array[p1]<array[mid]) p1=mid;
            else if(array[mid]<array[p2]) p2=mid;
        }
        return array[p2];
    }

    public static void main(String[] args)
    {
        int[] nums = {5,6,1,2,3,4};
        System.out.println(minNumberInRotateArray1(nums));
    }
}
