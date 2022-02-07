package work;

import java.util.ArrayList;
import java.util.List;
//https://www.geeksforgeeks.org/prime-numbers-after-prime-p-with-sum-s/
public class PrimeNumbers {
    public static void main(String[] args) {
        int n=4,p=3,s=54;
        List<List<Integer>> res=new ArrayList<>();
        find(res,new ArrayList<>(),n,p,s,s);
        System.out.println(res);

    }
    static void find(List<List<Integer>> res,List<Integer> temp,int n,int start,int end,int target){
        if(n==temp.size() && target==0){
            List<Integer> temp1=new ArrayList<>(temp);
            res.add(temp1);
            return;
        }
        for(int i=start+1;i<end;i++){
            if(isPrime(i) && (target-i)>=0){
                temp.add(i);
                find(res,temp,n,i,end,target-i);
                temp.remove(temp.size()-1);
            }
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
        }
        return true;
    }
}
