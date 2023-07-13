package NeetCode150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

class Solution5 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> res=new PriorityQueue<Integer>();
        for(int stone:stones) {
            res.add(-stone);
        }
        while(res.size()>1){
            int first=res.remove();
            int second=res.remove();
            if( first!=second) res.add(second-first);
        }
        return res.size()!=-1 ? res.remove():0;

    }
}

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones={2,7,4,1,8,1};
        Solution5 s=new Solution5();
        System.out.println(s.lastStoneWeight(stones));
    }
}
