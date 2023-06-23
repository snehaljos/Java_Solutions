package NeetCode150;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String args[]){
        int[] piles={3,6,7,11};
        Arrays.sort(piles);
        int l=1,h=8,len=piles.length,r=piles[len-1];
        int res=r;
        int k=0,hours=0;
        while(l<=r){
            k=(l+r)/2;
            hours=0;
            for(int p : piles){
                hours+=Math.ceil((double)p/k);
            }
            if(hours<=h){
                res=Math.min(res,k);
                r=k-1;
            }
            else{
                l=k+1;
            }
        }
        System.out.println(res);

    }
}
