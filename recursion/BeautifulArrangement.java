package work;
//https://leetcode.com/problems/beautiful-arrangement
import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangement {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(find(1));
    }
    static int find(int n){

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for(int i=1;i<=n;i++){
            temp.add(i);
        }
        generator(temp,res,0,n);
        boolean wrong=false;
        for(List<Integer> temp1 : res){
            for(int i=0;i<temp1.size();i++){
                if(temp1.get(i)%(i+1)==0 || (i+1)%temp1.get(i)==0){
                    continue;
                }
                wrong=true;
            }
            if(!wrong){
                count++;
            }
            wrong=false;
        }
        return count;
    }
    static void generator(List<Integer> temp, List<List<Integer>> res, int index, int target){
        if(index==target-1){
            List<Integer> temp2=new ArrayList<>(temp);
            res.add(temp2);
            return;
        }
        for(int i=index;i<target;i++) {
            swap(temp, index, i);
            if(temp.get(index)%(index+1)==0 || (index+1)%temp.get(index)==0){
                generator(temp, res, index + 1, target);
            }
            swap(temp, i, index);
        }

    }
    static void swap(List<Integer> temp,int first, int second){
        int temp1=temp.get(first);
        temp.set(first,temp.get(second));
        temp.set(second,temp1);
    }
}

