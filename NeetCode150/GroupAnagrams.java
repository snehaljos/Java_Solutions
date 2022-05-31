package NeetCode150;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        Map<Integer[],List<String>> res=new HashMap<>();
        char[] hash = new char[26];
        for(char c: "eat".toCharArray()){
            System.out.println(c);
            hash[c-'a']++;
        }
        System.out.println(Arrays.toString(hash));
        String str=new String(hash);
        System.out.println(str);
        for( String s: strs){
            Integer[] temp=new Integer[26];
            Arrays.fill(temp,0);
            for(int i=0;i<s.length();i++){
                temp[s.charAt(i)-'a']+=1;
            }
            if(res.get(temp)==null){
                res.put(temp,new ArrayList<String>());

            }
           // System.out.println(res.values());
            res.get(temp).add(s);




        }
        System.out.println(res.values());
    }
}
