package NeetCode150;

import java.util.HashMap;
import java.util.Map;

public class PermutationinString {
    public static void main(String[] args) {
        String s1="ab",s2="eidboaoo";
        Map<Character,Integer> count1=new HashMap<>();
        Map<Character,Integer> count2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            count1.put(s1.charAt(i),count1.getOrDefault(s1.charAt(i),0)+1);
            count2.put(s2.charAt(i),count2.getOrDefault(s2.charAt(i),0)+1);
        }
        int l=0,matches=0;
        for(int i=0;i<26;i++){
            if(count1.get(Character.toString(i+'a').charAt(0))==count2.get(Character.toString(i+'a').charAt(0))){
                matches++;
            }
        }
        for(int r=s1.length();r<s2.length();r++){
            if(matches==26) {
                System.out.println(true);
                break;
            }
            count2.put(s2.charAt(r),count2.getOrDefault(s2.charAt(r),0)+1);
            if(count2.get(s2.charAt(r))==count1.get(s2.charAt(r))){
                matches++;
            }
            else if(count2.getOrDefault(s2.charAt(r),0)==count1.getOrDefault(s2.charAt(r),0)+1){
                matches--;
            }
            count2.put(s2.charAt(l),count2.getOrDefault(s2.charAt(l),0)-1);
            if(count2.get(s2.charAt(l))==count1.get(s2.charAt(l))){
                matches++;
            }
            else if(count2.getOrDefault(s2.charAt(r),0)==count1.getOrDefault(s2.charAt(r),0)-1){
                matches--;
            }
            l++;
        }

            System.out.println(matches==26);

    }
}
