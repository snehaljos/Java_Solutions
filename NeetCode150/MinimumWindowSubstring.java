package NeetCode150;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "bbaa", t = "aba";
        Map<Character,Integer> counT=new HashMap<>();
        Map<Character,Integer> counS=new HashMap<>();
        for(int i=0;i<t.length();i++){
            counT.put(t.charAt(i),counT.getOrDefault(t.charAt(i),0)+1);
        }
        int[] res=new int[]{0,-1};
        int resLength=Integer.MAX_VALUE,l=0,need= counT.size(),have=0;

        for(int r=0;r<s.length();r++){
            counS.put(s.charAt(r),counS.getOrDefault(s.charAt(r),0)+1);
            if(t.indexOf(s.charAt(r))!=-1 && counS.get(s.charAt(r))==counT.get(s.charAt(r)) ){
                have++;
            }
            while(need==have){
                if((r-l+1)<resLength){
                    resLength=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                counS.put(s.charAt(l), counS.get(s.charAt(l))-1);
                if(t.indexOf(s.charAt(l))!=-1 && counS.get(s.charAt(l))< counT.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        if(resLength!=Integer.MAX_VALUE) {
            System.out.println(s.substring(res[0], res[1] + 1));
        }
        else{
            System.out.println("cvncv");
        }
    }
}
