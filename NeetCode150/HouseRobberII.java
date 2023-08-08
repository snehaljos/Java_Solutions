package NeetCode150;

import java.util.Arrays;

class Solution13 {
    public int robHelper(int[] nums) {
        int rob1=0,rob2=0,temp=0;
        for(int i=0;i<nums.length;i++){
            temp=Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=temp;
        }
        return rob2;
    }
    public int rob(int[] nums) {
        return Math.max(nums[0],Math.max(robHelper(Arrays.copyOfRange(nums,1,nums.length)),robHelper(Arrays.copyOfRange(nums,0,nums.length-1))));
    }
}
public class HouseRobberII {
    public static void main(String[] args) {
        Solution13 s=new Solution13();
        int nums[]={1,2,3,1};
        System.out.println(s.rob(nums));
    }
}
