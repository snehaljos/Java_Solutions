package NeetCode150;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
     String st="abcabcabb";
     Set<Character> res=new HashSet<>();
     int co=0,l=0;
     for(int r=0;r<st.length();r++){
         while(res.contains(st.charAt(r))){
             res.remove(st.charAt(l));
             l++;
         }
         res.add(st.charAt(r));
         co=Math.max(co, res.size());
     }
     System.out.println(co);
    }
}
