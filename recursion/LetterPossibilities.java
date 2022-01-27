package work;
//https://leetcode.com/problems/letter-tile-possibilities/
import java.util.HashSet;
import java.util.Set;

public class LetterPossibilities {
    public static void main(String[] args) {
        String input= "AAB";
        boolean[] tr=new boolean[input.length()];
        Set<String> res1=new HashSet<>();
        find("",input,input.length(),res1,tr);
        System.out.println(res1.size());
    }
    static void find(String p, String up,int len, Set<String> res,boolean[] tr){

       if( !p.isEmpty() ){
           res.add(p);
        }
       if(p.length()==len){
           return ;
       }
        if( up.isEmpty()){
            return ;
        }
        for(int i=0;i<up.length();i++){
            if(tr[i]==false) {
                tr[i] = true;
                find(p + Character.toString(up.charAt(i)), up,len, res, tr);
                tr[i]=false;
            }
            else{
                continue;
            }
        }
    }
}
