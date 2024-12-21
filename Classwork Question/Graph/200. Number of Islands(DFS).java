class Solution {
    public class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void dfs(int i, int j, char[][] grid, int vis[][], int n, int m) {
        if (i <0 || j< 0 || i>= n || j >= m || grid[i][j] == '0' || vis[i][j] == 1) {
            return;
        }

        vis[i][j] = 1;
        dfs(i-1,j,grid,vis,n,m);
        dfs(i+1,j,grid,vis,n,m);
        dfs(i,j-1,grid,vis,n,m);
        dfs(i,j+1,grid,vis,n,m);

    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        int ans = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    System.out.println(i + " " + j);
                    ans++;
                    dfs(i,j,grid,vis,n,m);
                }
            }
        }

        return ans;
    }
}
