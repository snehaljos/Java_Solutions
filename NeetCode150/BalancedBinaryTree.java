package NeetCode150;

public class BalancedBinaryTree {
    class Solution3 {
        private boolean flag = true;

        public int check(TreeNode root) {
            if (root == null)
                return 0;
            int c1 = check(root.left);
            int c2 = check(root.right);
            if (Math.abs(c1 - c2) > 1)
                flag = false;
            return (1 + Math.max(c1, c2));
        }
    }
}
