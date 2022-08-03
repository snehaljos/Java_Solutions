package NeetCode150;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n=3;
        String s="";
        List<String> res=new ArrayList<>();
        backtrack("",res,0,0,n);
        System.out.println(res);

    }
   public static void backtrack(String s, List<String> res,int open,int close,int n){
        if(open==close && close==n){
            res.add(s);
            return;
        }
        if(open<n){
            s+="(";
            backtrack(s,res,open+1,close,n);
            s=s.substring(0,s.length()-1);
        }
        if(close<open){
            s+=")";
            backtrack(s,res,open,close+1,n);
            s=s.substring(0,s.length()-1);
        }
    }


}
