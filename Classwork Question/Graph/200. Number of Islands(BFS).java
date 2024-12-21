class Solution {
    public class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public void bfs(int i, int j, char[][] grid, int vis[][], int n, int m) {
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));

        int dr[] = {-1,0,1,0};
        int dc[] = {0,1,0,-1};

        while(q.size() > 0) {
            Pair p = q.remove();

            for(int d=0;d<4;d++) {
                int nrow = p.row + dr[d];
                int ncol = p.col + dc[d];

                if ( nrow>=0 && nrow<n && ncol>=0 &&
                    ncol<m && grid[nrow][ncol] == '1' && 
                    vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
            }

        }

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
                    bfs(i,j,grid,vis,n,m);
                }
            }
        }

        return ans;
    }
}
