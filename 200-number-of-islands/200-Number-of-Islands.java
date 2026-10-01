class Solution {
    void bfs(int row,int col,boolean[][]vis,char[][]grid){
        int n=grid.length;
        int m=grid[0].length;

        Queue<int[]>q=new LinkedList<>();
        vis[row][col]=true;
        q.offer(new int[]{row,col});
        while(!q.isEmpty()){
            int[] front=q.poll();
            int r=front[0];
            int c=front[1];

            int[] drow={-1,0,1,0};//up,right,bottom,left
            int[] dcol={0,1,0,-1};

            for(int i=0;i<4;i++){//loop for checking in all 4 directions that it contains 1 and also should not be visited and it should be vaild also
                int nr=r+drow[i];
                int nc=c+dcol[i];

                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1' && !vis[nr][nc]){
                    vis[nr][nc]=true;
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][]vis=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    cnt++;//how many times bfs executes it will count the components 
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
}