package NeetCode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    List<List<String>> res = new ArrayList<>();
    String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};

    HashMap<String, List<String>> map = new HashMap();
        for(String s: strs){
        char[] hash = new char[26];
        for(char c: s.toCharArray()){
            hash[c-'a']++;
        }
        System.out.println(hash['e'-'a']);
        String str=new String(hash);
            System.out.println(str);
        if(map.get(str)==null){
            map.put(str, new ArrayList<>());
        }
        map.get(str).add(s);
    }
        res.addAll(map.values());
       System.out.println(res);
       System.out.println(map.values());
}
}
