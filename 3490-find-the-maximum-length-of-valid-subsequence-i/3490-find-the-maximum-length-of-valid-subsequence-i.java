class Solution {
    public int maximumLength(int[] nums) {
        int counteven=0;
        int countodd=0;
        for(int num:nums){
            if(num%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        int evendp=0;
        int odddp=0;
        for(int num:nums){
            if(num%2==0){
                evendp=Math.max(evendp,odddp+1);
            }
            else{
                odddp=Math.max(odddp,evendp+1);
            }
        }
        return Math.max(Math.max(counteven,countodd),Math.max(evendp,odddp));
    }
}