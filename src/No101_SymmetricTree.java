import java.util.Stack;

public class No101_SymmetricTree {
    //迭代
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode r1, TreeNode r2) {
        if (null == r1 && null == r2)
            return true;
        if (null == r1 || null == r2)
            return false;
        return r1.val == r2.val && isSymmetric(r1.left, r2.right) && isSymmetric(r1.right, r2.left);

    }

    //递归
    public boolean isSymmetric1(TreeNode root) {
        if (null == root) {
            return true;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(root.left);
        stack.push(root.right);

        while (!stack.empty()) {
            TreeNode p = stack.peek();
            stack.pop();
            TreeNode q = stack.peek();
            stack.pop();
            if (null == p && null == q)
                continue;
            if (null == p || null == q)
                return false;
            if (p.val != q.val)
                return false;
            stack.push(p.left);
            stack.push(q.right);

            stack.push(p.right);
            stack.push(q.left);
        }
        return true;
    }
}
