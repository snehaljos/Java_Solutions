package work;
//https://leetcode.com/problems/permutation-sequence
import java.util.ArrayList;

import java.util.List;


public class PermutationSequence {

    public static void main(String[] args) {
    List<Integer> in=new ArrayList<>();
    int[] fact=new int[10];
    int n=9,k=54494;
    fact[0]=1;
    fact[1]=1;
    fact[2]=2;
    for(int i=3;i<=n;i++){
        fact[i]=i*fact[i-1];
    }
    for(int i=1;i<=n;i++){
        in.add(i);
    }
    System.out.println(finder(k,n,"",in,fact));
    }

    static String finder(int k, int n, String res,List<Integer> in,int[] fact) {
        if(in.size()==1){
            res+=in.get(0);
            //in.remove(0);
            return res;
        }
        int index=(k-1)/fact[n-1];

        res+=in.get(index);
        in.remove(index);
        k-=fact[n-1]*index;
        return  finder(k,n-1,res,in,fact);

    }
}
