package work;
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/submissions/
import java.util.ArrayList;
import java.util.List;

public class findTheWinner {
    public static void main(String[] args) {
        List<Integer> res=new ArrayList<>();
        int n=5,k=2;
        for(int i=1;i<=n;i++){
        res.add(i);
        }
        find(k,k,0,res);
        System.out.println(res);
    }
    static void find(int k,int temp,int index,List<Integer> res){

        if(res.size()==1) return;
        temp--;
        if(temp<=0){
            res.remove(index);
            temp=k;
        }
        else {
            index++;


            if (index >= res.size()) {

                index = (index) % res.size();


            }
        }
        find(k,temp,index,res);
    }
}
