package NeetCode150;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeStrings {
    public static  String encode(List<String> strs){
        String res="";
        for(String temp: strs){
            res+=temp.length()+"#"+temp;
        }
        return res;
    }
    public static List<String> decode(String str){
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            res.add(str.substring(j+1,j+1+(Integer.parseInt(str.substring(i,j)))));
            i=j+1+(Integer.parseInt(str.substring(i,j)));
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> strs= new ArrayList<>();
        strs.add("lint");
        strs.add("code");
        strs.add("love");
        strs.add("you");
        String str=encode(strs);
        System.out.println(str);

        System.out.println(decode(str));
    }
}
