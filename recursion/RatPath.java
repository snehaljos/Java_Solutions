package work;
//https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
public class RatPath {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        boolean[][] visited =new boolean[matrix.length][matrix[0].length];
        System.out.println(find(matrix,visited,0,0));
    }
    static boolean find(int[][] matrix,boolean[][] visited,int i,int j){
        if(i==matrix.length-1 && j==matrix[0].length-1){
            return true;
        }
        boolean forward=false,down=false;
        visited[i][j]=true;
        if(i< matrix.length-1 && !visited[i+1][j] && matrix[i+1][j]!=0){
             forward=  find(matrix,visited,i+1,j);
        }
        if(j<matrix[0].length-1 && !visited[i][j+1] && matrix[i][j+1]!=0){
             down= find(matrix,visited,i,j+1);
        }
        visited[i][j]=false;
        return forward || down;
    }
}
