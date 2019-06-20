public class No437_PathSum3 {
    int pathSum = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        sum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return pathSum;
    }

    private void sum(TreeNode root, int sum) {
        if(root == null)
            return;
        sum -= root.val;
        if (sum == 0) {
            pathSum++;
        }
        sum(root.right, sum);
        sum(root.left, sum);
    }
}
