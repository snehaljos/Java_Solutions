package NeetCode150;

public class SubtreeofAnotherTree {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null &&  q==null){
                return true;
            }
            if(p==null || q==null || p.val!=q.val)
                return false;
            boolean p1=isSameTree(p.left,q.left);
            boolean p2=isSameTree(p.right,q.right);
            return (p1&&p2);
        }
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            if(root==null){
                return false;
            }
            if(root.val==subRoot.val &&isSameTree(root,subRoot))
                return true;
            return(isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot));
        }
    }
}
