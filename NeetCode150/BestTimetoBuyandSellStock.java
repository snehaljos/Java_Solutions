package NeetCode150;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices=new int[]{7,1,5,3,6,4};
        int res=0,l=0,r=1;
        while(r<prices.length){
            if(prices[l]>prices[r]){
                l=r;
            }
            else{
                res=Math.max(res,prices[r]-prices[l]);
            }
            r++;
        }
        System.out.println(res);
    }
}
