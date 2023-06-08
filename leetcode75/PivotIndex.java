package leetCode75;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args){
        int[] nums={1,2,3};
        int len=nums.length;
        int[] nums1=new int[len+1];
        int[] nums2=new int[len+1];
         nums1[0]=0;
         nums2[len]=0;
        for(int i=1;i<len+1;i++){
            nums1[i]=nums1[i-1]+nums[i-1];
        }
        for(int i=len-1;i>=0;i--){
            nums2[i]=nums2[i+1]+nums[i];
        }
        int flag=0,index=-1;
        for(int i=0;i<len;i++){
            if(nums1[i]==nums2[i+1]) {
                flag=1;
                index=i;
                break;
            }


        }

        System.out.println((flag==1)? index:-1);

    }
}
