package NeetCode150;
class Solution10 {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num:nums){
            res=res^num;
        }
        return res;
    }
}
public class SingleNumber {
    public static void main(String[] args) {
        Solution10 s=new Solution10();
        int[] nums={1,2,2};
        System.out.println(s.singleNumber(nums));
    }
}
