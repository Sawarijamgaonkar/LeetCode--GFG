class Solution {
    public int fib(int n) {
        int n1=0;
        int n2=1;
        int n3=0;
        while(n!=0){
            n3=n2+n1;
            n1=n2;
            n2=n3;
            n3=n1;
            n--;
        }
        return n3;


        // I am going to try this using recurssion now:
        // if(n<=1){
        //     return n;
        // }
        // return fib(n-1)+fib(n-2);
        // code runs but takes more time of around 8ms which means recurssion has higher time complexity in this case.
    }
}