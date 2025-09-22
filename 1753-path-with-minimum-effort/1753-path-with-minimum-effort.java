class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int[][] dist=new int[heights.length][heights[0].length];
        pq.add(new int[] {0,0,0});
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights[0].length;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        dist[0][0]=0;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        while(!pq.isEmpty()){
            int[] node=pq.poll();
            int effort=node[0];
            int x=node[1];
            int y=node[2];
            if(x==heights.length-1 && y==heights[0].length-1) return effort;
            for(int[] edge:directions){
                int nx=x+edge[0];
                int ny=y+edge[1];
                if(nx>=0 && ny>=0 && nx<heights.length && ny<heights[0].length){
                    int new_effort=Math.max(effort,Math.abs(heights[x][y]-heights[nx][ny]));
                    if(new_effort<dist[nx][ny]){
                        dist[nx][ny]=new_effort;
                        pq.add(new int[]{new_effort,nx,ny});
                    }
                }
            }
        }
        return -1;
    }
}