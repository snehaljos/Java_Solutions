package NeetCode150;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    static boolean isPalindrome(String in,int l, int r){
        while(l<r){
            if(!(in.charAt(l)==in.charAt(r)))
                return false;
            l++;r--;
        }
        return true;
    }
    static void find(String in,int pos,List<List<String>> res,List<String> temp){
        if(pos>=in.length()){
            res.add(new ArrayList<>(new ArrayList<>(temp)));
            return;
        }
        for(int i=pos;i<in.length();i++){
            if(isPalindrome(in,pos,i)){
                temp.add(in.substring(pos,i+1));
                find(in,i+1,res,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        List<List<String>> res=new ArrayList<>();
        String s="aab";
        find(s,0,res,new ArrayList<>());
        System.out.println(res);
    }
}
