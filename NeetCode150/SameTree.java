package NeetCode150;

class Solution2 {

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
}
public class SameTree {

        public static void main(String[] args) {
            TreeNode t1=new TreeNode(1);
            TreeNode t2=new TreeNode(2);
            TreeNode t3=new TreeNode(3);
            TreeNode t4=new TreeNode(1);
            TreeNode t5=new TreeNode(2);
            TreeNode t6=new TreeNode(3);
            t1.left=t2;
            t1.right=t3;
            t4.left=t5;
            t5.right=t6;
            Solution2 s=new Solution2();
            System.out.println(s.isSameTree(t1,t4));


        }
    }

