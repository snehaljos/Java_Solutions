package work;
//https://leetcode.com/problems/concatenated-words
import java.util.*;

public class ConcatenatedWords {

    public static void main(String[] args) {
        List<String> wo=new ArrayList<>();
        wo.add("cat");
        wo.add("dog");
        wo.add("cats");
        wo.add("catdogcat");
        wo.add("catsdogcats");
        wo.add("dogcatsdog");
        wo.add("hippopotamuses");
        Set<String> words=  new HashSet<>(wo);
        List<String> res=new ArrayList<>();
        for(String word:wo){
        words.remove(word);
            if(isCon(word,words)){
                res.add(word);
                System.out.println(word);
            }
         words.add(word);
        }
        System.out.println(res);
    }
    public static boolean isCon(String s, Set<String> words){
        if(s.isEmpty()){
            return false;
        }
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(!dp[j]) continue;
                if(words.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];


    }
}
