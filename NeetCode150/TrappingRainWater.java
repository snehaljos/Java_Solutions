package NeetCode150;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int l=0,r=height.length-1,res=0;
        int maxLeft=height[l],maxRight=height[r];
        while(l<r){
            if(maxLeft<maxRight){
                l++;
                maxLeft=Math.max(maxLeft,height[l]);
                res+=maxLeft-height[l];
            }
            else{
                r--;
                maxRight=Math.max(maxRight,height[r]);
                res+=maxRight-height[r];
            }
        }
        System.out.println(res);
    }

}
