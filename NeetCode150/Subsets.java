package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3};
        List<List<Integer>> res=new ArrayList<>();
        rec(0,nums,new ArrayList<>(),res);
        System.out.println(res);

    }
    public static  void rec(int i,int[] nums, List<Integer> subset,List<List<Integer>> res){
        if (i>=nums.length){
            List<Integer> temp2=new ArrayList<>(subset);
            res.add(temp2);
            return;
        }
        subset.add(nums[i]);
        rec(i+1,nums,subset,res);
        subset.remove(subset.size()-1);
        rec(i+1,nums,subset,res);
    }
}
