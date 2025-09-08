class Solution{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj= new ArrayList<>();
        int[] inDegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            adj.get(edge[0]).add(edge[1]);
            inDegree[edge[1]]++;
        }
        return bfs(adj,inDegree);
    }
    public boolean bfs(List<List<Integer>> adj, int[] inDegree){
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node=queue.poll();
            for(int neighbor:adj.get(node)){
                inDegree[neighbor]--;
                if(inDegree[neighbor]==0){
                    queue.add(neighbor);
                }
            }
        }
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]!=0){
                return false;
            }
        }
        return true;
    }
}