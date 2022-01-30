package work;
//https://leetcode.com/problems/all-paths-from-source-to-target
import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSource {
    public static void main(String[] args) {
        int[][] input=new int[][]{{2},{},{1}};
        List<List<Integer>> res=new ArrayList<>();
        find(res,new ArrayList<>(),input.length-1,input[0],input);
        System.out.println(res);
    }
    static void find(List<List<Integer>> res,List<Integer> path,int target,int[] temp,int[][] input){
        if(temp.length==0 && path.get(path.size()-1)==target){

            List<Integer> temp2=new ArrayList<>(path);
            temp2.add(0,0);
            res.add(temp2);
            return;
        }
        if(path.size()!=0 && path.get(0)==target){
            List<Integer> temp2=new ArrayList<>(path);
            temp2.add(0,0);
            res.add(temp2);
            return;
        }
        if(temp.length==0){
            return;
        }

        for(int i : temp){
            path.add(i);
            find(res,path,target,input[i],input);
            path.remove(path.size()-1);
        }

    }

}
