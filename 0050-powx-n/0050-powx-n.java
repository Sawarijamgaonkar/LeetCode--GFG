class Solution {
    public double myPow(double x, int n) {
        
        // stack overflow solution:
        // if(n==1){
        //     return x;
        // }
        // if(n==0){
        //     return 1;
        // }
        // return (x*myPow(x,(n-1)));

        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
            return x*myPow(x,n-1);
        }
        else if(n%2==0){
            return myPow(x*x,n/2);
        }
        else{
            return x*myPow(x,n-1);
        }

        // if(n==1){
        //     return x;
        // }
        // if(n==0){
        //     return 1;
        // }
        // int res=1;
        // for(int i=0;i<n;i++){
        //     res*=x;
        // }
        // return res;
    }
}