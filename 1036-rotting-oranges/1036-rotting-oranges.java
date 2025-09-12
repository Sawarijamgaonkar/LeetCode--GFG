class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        if(grid.length==0 || grid==null) return 0;
        int level=-1;
        int fresh=0;
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int k=0;k<size;k++){
                int[] point=queue.poll();
                for(int i=0;i<4;i++){
                    int ni=direction[i][0]+point[0];
                    int nj=direction[i][1]+point[1];
                    if(isValid(ni,nj,grid.length,grid[0].length)){
                        if(grid[ni][nj]==1){
                            queue.add(new int[]{ni,nj});
                            grid[ni][nj]=2;
                            fresh--;
                        }
                    }
                }
            }
            level++;
        }
        if(fresh==0) return level;
        return -1;
    }
    public boolean isValid(int i, int j, int n, int m){
        if(i<0||j<0||i>n-1||j>m-1){
            return false;
        }
        return true;
    }
}