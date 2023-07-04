package NeetCode150;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c1=maxDepth(root.left);
        int c2=maxDepth(root.right);
        return (1+Math.max(c1,c2));

    }
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t3.left=t4;
        t4.right=t5;
        MaximumDepthofBinaryTree w=new MaximumDepthofBinaryTree();
        System.out.println(w.maxDepth(t1));


    }
}
