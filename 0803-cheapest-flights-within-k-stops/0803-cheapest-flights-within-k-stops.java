class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < flights.length; i++)
            adj.get(flights[i][0]).add(new int[]{flights[i][1], flights[i][2]});

        // Minimal change: use dist[node][steps]
        int[][] dist = new int[n][k+2];
        for (int i = 0; i < n; i++)
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        dist[src][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.add(new int[]{src, 0, 0}); // node, cost_so_far, steps_so_far

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int u = node[0];
            int costSoFar = node[1];
            int stepsSoFar = node[2];
            if (u == dest && stepsSoFar <= k+1) return costSoFar;
            if (stepsSoFar == k+1) continue;
            for (int[] edge : adj.get(u)) {
                int v = edge[0], price = edge[1];
                if (costSoFar + price < dist[v][stepsSoFar + 1]) {
                    dist[v][stepsSoFar + 1] = costSoFar + price;
                    pq.add(new int[]{v, dist[v][stepsSoFar + 1], stepsSoFar + 1});
                }
            }
        }
        return -1;
    }
}
