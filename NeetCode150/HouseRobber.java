package NeetCode150;

public class HouseRobber {
    public static void main(String[] args) {
        int rob1=0,rob2=0,temp=0;
        int[] nums={1,2,3,1};
        for(int i=0;i<nums.length;i++){
            temp=Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=temp;
        }
        System.out.println(rob2);
    }
}
