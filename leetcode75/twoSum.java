package leetCode75;
//https://docs.google.com/spreadsheets/d/1A2PaQKcdwO_lwxz9bAnxXnIQayCouZP6d-ENrBz_NXc/edit#gid=0
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        Map<Integer,Integer> res=new HashMap<>();
        int[] in=new int[]{2,7,11,15};
        int target=9;
        for(int i=0;i<in.length;i++){
            if(res.containsKey(target-in[i])){
                System.out.println("["+i+","+res.get(target-in[i])+"]");
            }
            else{
                res.put(in[i],i);
            }
        }
    }
}
