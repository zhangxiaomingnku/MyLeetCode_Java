import java.util.ArrayList;
import java.util.List;

public class No179_BigestNum {
    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        List<String> dataList = new ArrayList<String>();
        for (int i = 0; i < nums.length; i++) {
            dataList.add(nums[i] + "");
        }
        //冒泡排序
        for (int i = 0; i < dataList.size() - 1; i++) {
            for (int j = 0; j < dataList.size() - i - 1; j++) {
                if (compare(dataList.get(j) + dataList.get(j + 1), dataList.get(j + 1) + dataList.get(j))) {
                    String temp = dataList.get(j);
                    dataList.set(j, dataList.get(j + 1));
                    dataList.set(j + 1, temp);
                }
            }
        }
        if(dataList.get(0).equals("0"))
            return "0";
        String ans = new String();
        for (int i = 0; i < dataList.size(); i++) {
            ans += dataList.get(i);
        }
        return ans;
    }

    /**
     * 比较两个相同长度字符串
     *
     * @param s1
     * @param s2
     * @return
     */
    private static boolean compare(String s1, String s2) {
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if ((s1.charAt(i) - s2.charAt(i)) > 0)
                return false;
            else if ((s1.charAt(i) - s2.charAt(i)) < 0)
                return true;
            else
                continue;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
        int[] nums1 = {0,0};
        System.out.println(largestNumber(nums1));
    }
}
