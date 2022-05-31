package NeetCode150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,1,2,2,3};
        Map<Integer,Integer> res=new HashMap<>();
        for(Integer temp:nums){
            if(res.get(temp)==null){
                res.put(temp,0);
            }
            res.put(temp,res.get(temp)+1);
        }

        System.out.println(res.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());
    res.remove(1);
        System.out.println(res.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey());

    }

}
