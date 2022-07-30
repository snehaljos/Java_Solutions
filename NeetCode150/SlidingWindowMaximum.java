package NeetCode150;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3,l=0,r=0,i=0;
        int[] res=new int[k*2];
        Deque<Integer> dq = new ArrayDeque<>();
        while(r<nums.length){
            while(!dq.isEmpty() && nums[dq.getFirst()]<nums[r]){
                dq.removeLast();
            }
            dq.addLast( r);
            if(l>dq.getFirst()){
                dq.removeFirst();
            }
            if(r+1>=k){
                res[i++]=nums[dq.getFirst()];
                l++;
            }
            r++;
        }
        System.out.println(Arrays.toString(res));
    }

}
