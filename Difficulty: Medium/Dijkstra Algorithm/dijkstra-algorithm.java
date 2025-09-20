class Solution {
    class Edge{
        int src, dest, wt;
        Edge(int src, int dest, int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    class Pair implements Comparable<Pair>{
        int node;
        int shortestDist;
        Pair(int node, int dist){
            this.node=node;
            this.shortestDist=dist;
        }
        public int compareTo(Pair p2){
            return this.shortestDist-p2.shortestDist;
        }
    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<ArrayList<Edge>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            graph.get(u).add(new Edge(u,v,w));
            graph.get(v).add(new Edge(v,u,w));
        }
        
        // actual algo part:
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        boolean[] visited=new boolean[V];
        PriorityQueue<Pair> pq=new PriorityQueue<>(); //min heap
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                for(Edge neighbor: graph.get(curr.node)){
                    int u=neighbor.src;
                    int v=neighbor.dest;
                    int w=neighbor.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){
                        dist[v]=dist[u]+w;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        return dist;
    }
}