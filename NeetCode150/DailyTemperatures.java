package NeetCode150;

import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures={73,74,75,71,69,72,76,73};
        int[] res=new int[temperatures.length];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<temperatures.length;i++) {
           while (!st.isEmpty() && temperatures[i]>temperatures[st.peek()]) {
                int a=st.pop();
                res[a]=i-a;
           }
           st.push(i);
       }
        System.out.print(Arrays.toString(res));
    }
}
