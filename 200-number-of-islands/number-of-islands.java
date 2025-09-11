class Solution {
    int[] dx={0,1,0,-1};
    int[] dy={1,0,-1,0};
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, char[][] grid){
        grid[i][j]='0';
        for(int k=0;k<4;k++){
            int ni=i+dx[k];
            int nj=j+dy[k];
            if(isValid(ni,nj,grid.length,grid[0].length)){
                if(grid[ni][nj]=='1'){
                    bfs(ni,nj,grid);
                }
            }
        }
    }
    public boolean isValid(int i, int j, int n, int m){
        if( i>n-1 || j>m-1 ||i<0 ||j<0){
            return false;
        }
        return true;
    }
}