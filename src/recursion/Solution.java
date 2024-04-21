package recursion;


class Solution {

    public static void main(String[] args) {
        char[][] arr= {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
    };

        System.out.println(numIslands(arr));
    }
    // Recursive function to mark all connected land cells as visited
    static void solve(int r, int c, char[][] grid, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;

        // Mark current cell as visited
        vis[r][c] = true;

        // Define movements in up, down, left, and right directions
        int[] dp1 = {1, -1, 0, 0};
        int[] dp2 = {0, 0, -1, 1};

        // Check all four adjacent cells
        for (int i = 0; i < 4; i++) {
            int nr = dp1[i] + r; // new row
            int nc = dp2[i] + c; // new column

            // Check if the adjacent cell is within the grid boundaries,
            // unvisited, and contains land ('1')
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && grid[nr][nc] == '1') {
                // Recursively call solve function for the adjacent land cell
                solve(nr, nc, grid, vis);
            }
        }
    }

    // Main function to count the number of islands
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;

        // Matrix to keep track of visited cells
        boolean[][] vis = new boolean[n][m];

        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If current cell is land ('1') and not visited
                if (grid[i][j] == '1' && !vis[i][j]) {
                    // Call solve function to mark all connected land cells as visited
                    solve(i, j, grid, vis);
                    // Increment island count
                    ans++;
                }
            }
        }

        // Return the total number of islands
        return ans;
    }
}