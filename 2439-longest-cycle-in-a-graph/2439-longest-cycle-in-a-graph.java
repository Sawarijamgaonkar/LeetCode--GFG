class Solution {
    int res=-1;
    public int longestCycle(int[] edges) {
        boolean[] visited=new boolean[edges.length];
        int[] inPath=new int[edges.length];
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                dfs(0,i,visited,inPath,edges);
            }
        }
        return res;
    }
    public void dfs(int count,int node, boolean[] visited, int[] inPath,int[] edges){
        count++;
        visited[node]=true;
        inPath[node]=count;
        int neighbor=edges[node];
        if(neighbor!=-1){
            if(!visited[neighbor]){
                dfs(count,neighbor,visited,inPath,edges);
            }
            else{
                if(inPath[neighbor]!=0){
                    // res=Math.max(res,inPath[neighbor]-inPath[node]+1);
                    res=Math.max(res, count - inPath[neighbor] + 1);
                }
            }
        }
        inPath[node]=0;
    }
}