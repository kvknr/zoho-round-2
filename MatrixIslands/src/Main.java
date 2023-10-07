public class Main {
    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rowCount = grid.length;
        int colCount = grid[0].length;
        int islandCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (grid[i][j] == 1) {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private static void dfs(int[][] grid, int row, int col) {
        int rowCount = grid.length;
        int colCount = grid[0].length;

        if (row < 0 || row >= rowCount || col < 0 || col >= colCount || grid[row][col] != 1) {
            return;
        }

        // Mark the current cell as visited
        grid[row][col] = -1;

        // Recursively explore neighboring cells
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, -1, -1, 1},
                {-1, 1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, 1}
        };

        int islandCount = numIslands(grid);
        System.out.println("Number of islands: " + islandCount);
    }
}
