package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
    static void sol(int i,int[] nums,List<Integer> temp,List<List<Integer>> res){
        if(i>=nums.length){
            List<Integer> res1= new ArrayList<>(temp);
            if(!res.contains(res1))
            res.add(res1);
            return;
        }
        temp.add(nums[i]);
        sol(i+1,nums,temp,res);
        temp.remove(temp.size()-1);
        while(i+1< nums.length && nums[i]==nums[i+1])
            i++;
        sol(i+1,nums,temp,res);
    return;
    }
    public static void main(String[] args) {
        int[] nums={4,4,4,1,4};
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        sol(0,nums,new ArrayList<>(),res);
        System.out.println(res);
    }
}
//[[]-,[1]-,[1,4]-,[1,4,4],[1,4,4,4],[1,4,4,4,4],[4],[4,4]-,[4,4,4]-,[4,4,4,4]-]