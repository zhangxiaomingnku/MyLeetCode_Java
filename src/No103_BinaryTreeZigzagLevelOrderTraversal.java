import java.util.*;

public class No103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<TreeNode> st_right = new Stack<>();
        Stack<TreeNode> st_left = new Stack<>();
        if (root == null) return res;
        st_right.push(root);
        boolean direction = true;
        while (!st_right.isEmpty() || !st_left.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (direction) {
                while (!st_right.isEmpty()) {
                    TreeNode cur = st_right.pop();
                    list.add(cur.val);
                    if (cur.left != null) st_left.push(cur.left);
                    if (cur.right != null) st_left.push(cur.right);
                }
            } else {
                while (!st_left.isEmpty()) {
                    TreeNode cur = st_left.pop();
                    list.add(cur.val);
                    if (cur.right != null) st_right.push(cur.right);
                    if (cur.left != null) st_right.push(cur.left);
                }
            }
            direction = !direction;
            res.add(list);
        }
        return res;
    }
}
