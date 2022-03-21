package leetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iiiSum {
    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
             int a=nums[i];
            if(i>0 && a==nums[i-1]){
                continue;
            }
            int l=i+1,r= nums.length-1;
            while(l<r){
                int threeSum=a+nums[l]+nums[r];
                if(threeSum>0){
                    r--;
                }
                else if(threeSum<0){
                    l++;
                }
                else{
                    List<Integer> temp=new ArrayList<>(Arrays.asList(a,nums[l],nums[r]));
                    res.add(temp);
                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                }
            }
         }
         System.out.println(res);
    }
}
