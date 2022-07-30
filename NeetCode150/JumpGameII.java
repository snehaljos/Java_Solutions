package NeetCode150;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1,1,4};

        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int res=0,r=0,l=0,fur=0;

        while(r<nums.length-1){
            fur=0;
            for(int i=l;i<=r;i++)
                fur=Math.max(fur,i+nums[i]);
            l=r+1;
            r=fur;
            res++;
        }
        return res;
    }
}
