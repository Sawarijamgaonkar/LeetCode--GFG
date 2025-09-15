class Solution {
    public int makeConnected(int n, int[][] connections) {
        boolean[] visited=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:connections){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int count=-1;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(connections.length);
        return connections.length-count==count?-1:count;
    }
    public void dfs(int node,List<List<Integer>> adj, boolean[] visited){
        visited[node]=true;
        for(int neighbor:adj.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,adj,visited);
            }
        }
    }
}