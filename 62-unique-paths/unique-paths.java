class Solution {
    
    public int uniquePaths(int m, int n) {
//         using recurssion time limit increaing after 41 teastcases out of 63. 
//         if(m == 1 || n == 1) return 1;
        
// 		// move up
//         int upMove = uniquePaths(m-1, n);
// 		// move left
//         int leftMove = uniquePaths(m, n-1);
        
//         return upMove + leftMove;
        
        
        
//         using dynamic programming by converting recurssion to memoization and timelimit exceeds after 37 out of 63 testcases.
        // if(m==1||n==1){
        //     return 1;
        // }
        // int dp[][]=new int[m+1][n+1];
        // // if(m==1||n0){
        // //     return 0;
        // // }
        // if(dp[m][n]>0){
        //     return dp[m][n];
        // }
        // int left=uniquePaths(m-1,n);
        // int up=uniquePaths(m,n-1);
        // return dp[m][n]=left+up;
        
        
//         imporving this solution converting memoization with tabulation.
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}