// // User function Template for Java


// Brute force thinking using BFS: TLE- TC=O(H x n x m)
// class Solution {
//     public int[][] chefAndWells(int n, int m, char grid[][]) {
//         if(grid.length==0||grid==null) return new int[n][m];
//         int[][] directions={{0,1},{0,-1},{-1,0},{1,0}};
//         int[][] result=new int[grid.length][grid[0].length];
//         Queue<int[]> queue=new LinkedList<>();
//         int countH=0;
//         int countW=0;
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]=='H'){
//                     queue.add(new int[]{i,j});
//                     countH++;
//                 }
//                 else if(grid[i][j]=='N'||grid[i][j]=='.'){
//                     result[i][j]=0;
//                 }
//                 else{
//                     countW++;
//                     result[i][j]=0;
//                 }
//             }
//         }
//         if(countH==0||countW==0) return result;
//         Queue<int[]> minQueue=new LinkedList<>();
//         while(!queue.isEmpty()){
//             int dist=0;
//             int[] node=queue.poll();
//             minQueue.add(node);
//             while(!minQueue.isEmpty()){
//                 int[] point=minQueue.poll();
//                 for(int i=0;i<4;i++){
//                     int ni=point[0]+directions[i][0];
//                     int nj=point[1]+directions[i][1];
//                     if(isValid(ni,nj,n,m)){
//                         if(grid[ni][nj]=='.'||grid[ni][nj]=='H'){
//                             dist++;
//                             minQueue.add(new int[]{ni,nj});
//                         }
//                     }
//                 }
//             }
//             result[node[0]][node[1]]=dist*2;
//         }
//         return result;
//     }
//     public boolean isValid(int i,int j, int n, int m){
//         if(i<0||j<0||i>n-1||j>m-1){
//             return false;
//         }
//         return true;
//     }
// }



// class Solution{
//     public int[][] chefAndWells(int n, int m, char grid[][]) {
//         int[][] result=new int[n][m];
//         int[][] direction={{0,1},{0,-1},{1,0},{-1,0}};
//         if(grid==null||grid.length==0) return result;
//         Queue<int[]> queue=new LinkedList<>();
//         int countH=0;
//         int countW=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
        //         if(grid[i][j]=='W'){
        //             queue.add(new int[]{i,j});
        //             countW++;
        //             result[i][j]=0;
        //         }
        //         else if(grid[i][j]=='H'){
        //             countH++;
        //             result[i][j]=-1;
        //         }
        //         else{
        //             result[i][j]=0;
        //         }
        //     }
        // }
        // if(countW==0 || countH==0) return result;
//         while(!queue.isEmpty()){
//             int size=queue.size();
//             for(int i=0;i<size;i++){
//                 int dist=0;
//                 int[] point=queue.poll();
//                 for(int k=0;k<4;k++){
//                     int ni=point[0]+direction[k][0];
//                     int nj=point[1]+direction[k][1];
//                     if(isValid(ni,nj,n,m)){
//                         if(grid[ni][nj]=='H'){
//                             dist++;
//                             result[ni][nj]=2*dist;
//                             queue.add(new int[]{ni,nj});
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }
//     public boolean isValid(int i, int j, int n, int m){
//         if(i<0 ||j<0||i>n-1||j>m-1){
//             return false;
//         }
//         return true;
//     }
// }




class Solution
{
    public int [][] noWells(int n,int m, char c[][],int ans[][])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(c[i][j]=='H') 
                {
                    ans[i][j]=-1;//since no well present so, -1
                }
                else if(c[i][j]=='N')
                {
                    ans[i][j]=0; // it is restricted area, so 0
                }
                else if(c[i][j]=='.')
                {
                    ans[i][j]=0; // it's an open area, so 0
                }
            }
        }
        return ans;
    }
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int ans[][]= new int[n][m];
        //fill answer array with max integer value;
        //Arrays.fill(ans,Integer.MAX_VALUE);
        
        Queue<Pos>q= new LinkedList<>();
        boolean visited[][]= new boolean[n][m];//records for visited index
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(c[i][j]=='W')
                {
                    q.add(new Pos(i,j));//Adding position of the wells into queue
                    visited[i][j]=true;
                }
                else
                {
                    //Initializing parts , other than 'Wells' as Maximum 
                    ans[i][j]=Integer.MAX_VALUE;
                }
            }
        }
        if(q.size()==0)//if no wells is present
        {
            return noWells(n,m,c,ans);
        }
        
        //Four directions to search for home
        // Direction->     up,right,down,left
        int dr[]= new int[]{-1,0,1,0};
        int dc[]= new int[]{0,1,0,-1};
        
        //Initializing dstance as 0, because distance from well - well is 0
        int distance=0;//distance from well
        
        while(q.size()>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pos p= q.poll();
                int row=p.i;
                int col=p.j;
                if(c[row][col]=='W'||c[row][col]=='.')
                {
                    ans[row][col]=0;
                }
                else if(c[row][col]=='H')
                {
                    ans[row][col]=Math.min(ans[row][col],distance*2);
                }
                for(int j=0;j<4;j++)
                {
                    int nr=row+dr[j];
                    int nc=col+dc[j];
                    if(nr<0||nr>=n||nc<0||nc>=m)//invalid co-ordinates
                    {
                        continue;
                    }
                    else if(visited[nr][nc]==false && (c[nr][nc]=='H'|| c[nr][nc]=='.')) //encountered a home
                    {
                        q.add(new Pos(nr,nc));
                        visited[nr][nc]=true;
                    }
                }
            }
            distance++;
        }
        
        //Even after the while loop terminates, there will be some places not visited
        //if the place contains 'N' & 'H' we'll mark it 0 and -1 respectively
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(visited[i][j]==false && c[i][j]=='N')
                {
                    ans[i][j]=0; //N represents restricted area
                    visited[i][j]=true;
                }
                if(visited[i][j]==false && c[i][j]=='H')
                {
                    ans[i][j]=-1; //This Home is unreachable
                    visited[i][j]=true;
                }
                if(visited[i][j]==false && c[i][j]=='.')
                {
                    ans[i][j]=0; //This ground is unreachable
                    visited[i][j]=true;
                }
            }
        }
        
        return ans;
    }
    class Pos{
        int i;
        int j;
        Pos(int i,int j)
        {
            this.i=i;
            this.j=j;
        }
    }
}