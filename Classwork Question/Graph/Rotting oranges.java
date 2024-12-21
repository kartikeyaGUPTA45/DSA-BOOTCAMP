class Solution {
    public class Triple {
        int row;
        int col;
        int time;

        public Triple(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<Triple> q = new LinkedList<>();

        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;


        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if (grid[i][j] == 1) cnt++;
                else if (grid[i][j] == 2) {
                    q.add(new Triple(i,j,0));
                }
            }
        }

        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};

        int ans = 0;
        
        while(q.size() > 0) {
            Triple t = q.remove();

            for(int dir = 0;dir<4;dir++) {
                int nrow = t.row + dr[dir];
                int ncol = t.col + dc[dir];
                ans = Math.max(ans,t.time);

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == 1) {
                    grid[nrow][ncol] = 2;
                    q.add(new Triple(nrow,ncol,t.time+1));
                    
                    cnt--;
                }
            }
        }

        if (cnt == 0) return ans;
        else return -1;
        
    }
}
