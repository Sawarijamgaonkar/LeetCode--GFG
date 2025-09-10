class Solution {
    int[] dx=new int[]{0,1,0,-1};
    int[] dy=new int[]{1,0,-1,0};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        boolean[][] visited=new boolean[image.length][image[0].length];
        int curr_color=image[sr][sc];
        bfs(image,sr,sc,color,visited,curr_color);
        return image;
    }
    public void bfs(int[][] image, int i, int j,int color,boolean[][] visited,int curr_color){
        visited[i][j]=true;
        if(image[i][j]==curr_color){
            image[i][j]=color;
            for(int k=0;k<4;k++){
                int ni=i+dx[k];
                int nj=j+dy[k];
                if(isValid(ni,nj,image.length,image[0].length)){
                    if(!visited[ni][nj]) bfs(image,ni,nj,color,visited,curr_color);
                }
            }
        }
    }
    public boolean isValid(int i, int j,int n, int m){
        if(i>n-1 || j>m-1 || i<0 || j<0){
            return false;
        }
        return true;
    }
}