package NeetCode150;
class Solution6 {
    public int minCostClimbingStairs(int[] cost) {
        int[] res=new int[cost.length+1];
        for(int i=0;i<cost.length;i++){
            res[i]=cost[i];
        }
        res[cost.length]=0;
        for(int i=cost.length-2;i>=0;i--){
            res[i]=res[i]+Math.min(res[i+1],res[i+2]);
        }
        return Math.min(res[0],res[1]);

    }
}
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        Solution6 s=new Solution6();
        int[] cost={10,15,10};
        System.out.println(s.minCostClimbingStairs(cost));
    }
}
