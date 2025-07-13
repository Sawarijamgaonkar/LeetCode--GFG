class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        if(trainers.length==0 || players.length==0){
            return 0;
        }
        int count=0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        while(j<trainers.length && i<players.length){
            // System.out.println(trainers[j]);
            if(players[i]<=trainers[j]){
                    // System.out.println(trainers[j]);
                count++;
                System.out.println(players[i]+" "+ trainers[j]+" "+count);
                i++;
                j++;
            }
            else{
                j++;
            }
                
        }
        return count;
    }
}