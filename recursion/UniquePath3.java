package work;
//https://leetcode.com/problems/unique-paths-iii
public class UniquePath3 {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0, 1}, {2, 0}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int row = 0, col = 0, count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row = i;
                    col = j;
                } else if (grid[i][j] == 0) {
                    count++;
                }

            }

        }

        System.out.println(find(count + 1, row, col, grid, visited));
    }

    public static int find(int count, int row, int col, int[][] grid, boolean[][] visited) {
        if (grid[row][col] == 2 && count == 0) {
            return 1;
        }
        if (count != 0 && grid[row][col] == 2) {
            return 0;
        }
        if (count <= 0 && grid[row][col] != 2) {
            return 0;
        }
        visited[row][col] = true;
        int count1 = 0;
        if (grid[row][col] != -1) {

            if (row + 1 >= 0 && row + 1 < grid.length && !visited[row + 1][col]) {
                count1 += find(count - 1, row + 1, col, grid, visited);
            }
            if (col + 1 >= 0 && col + 1 < grid[0].length && !visited[row][col + 1]) {

                count1 += find(count - 1, row, col + 1, grid, visited);

            }
            if (row - 1 >= 0 && row - 1 < grid.length && !visited[row - 1][col]) {

                count1 += find(count - 1, row - 1, col, grid, visited);

            }
            if (col - 1 >= 0 && col - 1 < grid[0].length && !visited[row][col - 1]) {

                count1 += find(count - 1, row, col - 1, grid, visited);
            }
        }
        visited[row][col] = false;
        return count1;
    }
}
