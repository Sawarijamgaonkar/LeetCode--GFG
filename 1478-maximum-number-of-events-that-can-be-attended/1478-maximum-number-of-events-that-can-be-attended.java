class Solution {
    // public int maxEvents(int[][] events) {
    //     int count=0;
    //     Arrays.sort(events,(a,b)->Integer.compare(a[0],b[0]));
    //     HashSet<Integer> set=new HashSet<>();
    //     for(int i=0;i<events.length;i++){
    //         for(int j=0;j<1;j++){
    //             if(events[i][j]<=events[i][j+1] && (!set.contains(events[i][j]) ||!set.contains(events[i][j+1]))){
    //                 count++;
    //                 set.add(events[i][j]);
    //             }
    //         }
    //     }
    //     return count;
    // }
    // public int maxEvents(int[][] events) {
    //     Arrays.sort(events, Comparator.comparingInt(a -> a[0]));
    //     boolean[] used = new boolean[100001];
    //     int count = 0;
    //     for (int[] e : events) {
    //         for (int d = e[0]; d <= e[1]; d++) {
    //             if (!used[d]) {
    //                 used[d] = true;
    //                 count++;
    //                 break;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        
        int day = 0, index = 0 , n = events.length ,result = 0;      
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (!pq.isEmpty() || index < n) {
            if (pq.isEmpty()) {
                day = events[index][0];
            }
            while (index < n && events[index][0] <= day) {
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            result++; 
            day++;    

            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        return result;
    }
}