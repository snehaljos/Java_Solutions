package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public void findHelper(int[] nums, List<List<Integer>> res, LinkedList<Integer> temp){
        if(temp.size()==3){
            res.add((List<Integer>) temp.clone());
            return;

        }
        if(nums.length<=0) return;

        for(int i=0;i<nums.length;i++){
           if(temp.contains(nums[i])) continue;
           temp.addLast(nums[i]);
            findHelper(nums,res,temp);
            temp.pollLast();

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        LinkedList<Integer> temp=new LinkedList<>();
        findHelper(nums,res,temp);
        return res;
    }
}
public class Permutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        Solution s=new Solution();
        System.out.println(s.permute(nums));
    }
}
