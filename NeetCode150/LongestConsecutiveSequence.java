package NeetCode150;

import java.util.*;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums=new int[]{100,4,200,1,3,2};
       Set<Integer> num= Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int le=0;
        for(int n:num){
            if(!num.contains(n-1)){
                int length=0;
                while(num.contains(n+length)){
                    length+=1;
                }
                le=Math.max(le,length);
            }
       }
        System.out.println(le);

    }
}
