package work;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        List<String> res=new ArrayList<>();
        find("","9",res);
        System.out.println(res);
    }
    static void find(String p, String up, List<String> res){
        if(up.isEmpty()){
            res.add(p);
            return;
        }
        int a=up.charAt(0)-'0';
        if(a==7){
            for(int i=((a-2)*3);i<=((a-1)*3);i++){
                char s=(char)('a'+i);
                find(p+s,up.substring(1),res);
            }
        }
        else if(a==8){
            for(int i=((a-2)*3)+1;i<=((a-1)*3);i++){
                char s=(char)('a'+i);
                find(p+s,up.substring(1),res);
            }
        }
        else if(a==9){
            for(int i=((a-2)*3)+1;i<=((a-1)*3)+1;i++){
                char s=(char)('a'+i);
                find(p+s,up.substring(1),res);
            }
        }
        else{
        for(int i=((a-2)*3);i<((a-1)*3);i++){
            char s=(char)('a'+i);
            find(p+s,up.substring(1),res);
        }}
    }
}
