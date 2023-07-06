package NeetCode150;
class Solution {
    private int max=0;

    private int findDia(TreeNode root){
        if(root==null){
            return 0;
        }
        int c1=findDia(root.left);
        int c2=findDia(root.right);
        max=Math.max(max,(c1+c2));

        return (1+Math.max(c1,c2));

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int t=findDia(root);
        return max;
    }
}
public class DiameterofBinaryTree {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        Solution w=new Solution();
        System.out.println(w.diameterOfBinaryTree(t1));


    }
}
