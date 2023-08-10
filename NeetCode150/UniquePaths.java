package NeetCode150;

import java.util.Arrays;

class Solution15 {
    public int uniquePaths(int m, int n) {
        int[] row=new int[n],newRow;
        Arrays.fill(row,1);

        for(int i=0;i<m-1;i++){
            newRow= new int[n];
            Arrays.fill(newRow,1);
            for(int j=n-2;j>=0;j--){
                newRow[j]=newRow[j+1]+row[j];
            }
            row=newRow;
        }
        return row[0];
    }
}
public class UniquePaths{
    public static void main(String[] args) {
        Solution15 s=new Solution15();
        System.out.println(s.uniquePaths(3,7));
    }
}
