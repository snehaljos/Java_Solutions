package NeetCode150;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s="AABABBA";
        int k=1,re=0;
        Map<Character,Integer> res=new HashMap<>();
        int l=0;
        for(int r=0;r<s.length();r++){
            res.put(s.charAt(r),res.getOrDefault(s.charAt(r),0)+1);
            while((r-l+1)- Collections.max(res.values())>k){
                res.put(s.charAt(l),res.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
        re=Math.max(re,r-l+1);
        }
        System.out.println(re);

    }
    
}
