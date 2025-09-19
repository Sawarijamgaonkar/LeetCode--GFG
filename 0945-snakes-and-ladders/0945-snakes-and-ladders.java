class Solution {
    public int snakesAndLadders(int[][] board) {
        int n=board.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        Queue<Integer> queue=new LinkedList<>();
        int current=1;
        boolean[] visited=new boolean[n*n+1];
        System.out.print("current: ");
        for(int i=n-1;i>=0;i--){
            if((n-i-1)%2==0){
                for(int j=0;j<n;j++){
                    if(board[i][j]!=-1){
                        map.put(current,board[i][j]);
                    }
                    System.out.print(current+" ");
                    current++;
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    if(board[i][j]!=-1){
                        map.put(current,board[i][j]);
                    }
                    System.out.print(current+" ");
                    current++;
                }
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n*n;i++) adj.add(new ArrayList<>());
        for(int i=1;i<n*n;i++){
            for(int count=1;count<=6;count++){
                int neighbor=i+count;
                if(neighbor<=n*n){
                    if(map.containsKey(neighbor)){
                        adj.get(i).add(map.get(neighbor));
                    }
                    else{
                        adj.get(i).add(neighbor);
                    }
                }
            }
            System.out.println("neighbor of :"+i +": " +adj.get(i));
        }
        // for(int i=0;i<adj.size();i++){
        //     System.out.print("neighbor of"+i+" ");
        //     for(int neighbor: adj.get(i)){
        //         System.out.print(neighbor+ " ");
        //     }
        //     System.out.println();
        // }
        int level=0;
        queue.add(1);
        visited[1]=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int node=queue.poll();
                if(node==n*n) return level;
                for(int neighbor: adj.get(node)){
                    if(!visited[neighbor]){
                        queue.add(neighbor);
                        visited[neighbor]=true;
                        System.out.println("neighbor of "+node+": "+neighbor);
                    }
                }
            }
            System.out.println(level);
            level++;
        }
        return -1;
    }
}