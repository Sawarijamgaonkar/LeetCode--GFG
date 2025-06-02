class Solution {
    public int climbStairs(int n) {
        // this is like factorial where this steps types are based on ways steps can be taken at previous step.
        int n1=2;
        int n2=3;
        int n3=0;
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        for(int i=3;i<n;i++){
            n3=n2+n1;
            n1=n2;
            n2=n3;
        }
        return n3;
    }
}