package work;
//https://leetcode.com/problems/path-with-maximum-gold
import java.util.ArrayList;

import java.util.List;

public class GoldPath {
    public static void main(String[] args) {
        int[][] grid=new int[][]{{0,6,0},{5,8,7},{0,9,0}};
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        List<Integer> res=new ArrayList<>();
        res.add(0);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j< grid[0].length;j++){
                if(grid[i][j]!=0){
                    run(grid,visited,res,i,j,0);
                }
            }
        }
        System.out.println(res);

    }
    static void run(int[][] grid, boolean[][] visited, List<Integer> res, int i, int j, int sum){
        sum+=grid[i][j];
        visited[i][j]=true;

        if(j<grid[0].length-1 && !visited[i][j+1]   && grid[i][j+1]!=0){
            run(grid,visited,res,i,j+1,sum);
        }
        if(j>0 && !visited[i][j-1]   && grid[i][j-1]!=0){
            run(grid,visited,res,i,j-1,sum);
        }
        if(i<grid.length-1 && !visited[i+1][j]   && grid[i+1][j]!=0){
            run(grid,visited,res,i+1,j,sum);
        }
        if(i>0 && !visited[i-1][j]   && grid[i-1][j]!=0){
            run(grid,visited,res,i-1,j,sum);
        }
        if(sum>res.get(res.size()-1)){
           res.remove(res.size()-1);
           res.add(sum);
        }
        sum-=grid[i][j];
        visited[i][j]=false;

    }

}
