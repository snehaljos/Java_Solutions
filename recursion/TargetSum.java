package work;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        System.out.println(help(new int[]{1,1,1},3,0));
    }
    static int help(int[] nums,int target,int sum){
        if(nums.length==0 && target==sum){
            return 1;
        }
        if(nums.length==0 && target!=sum){
            return 0;
        }
        int count=0;
        count+=help(Arrays.copyOfRange(nums,1,nums.length),target,sum+nums[0]);
        count+=help(Arrays.copyOfRange(nums,1,nums.length),target,sum-nums[0]);
        return  count;

    }
}
