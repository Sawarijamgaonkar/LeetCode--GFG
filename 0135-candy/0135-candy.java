class Solution {
//     public int candy(int[] ratings) {
//         int maxRating=0;
//         int currentmax=ratings[0];
//         int candies[]=new int[ratings.length];
//         for(int i=1;i<ratings.length;i++){
//             for(int j=1;j<ratings.length;j++){
//                 if(currentmax>ratings[j-1]){
//                     candies[j]=1;
//                 }
//                 else{
//                     if(j==0){
//                         candies[j]=1;
//                     }
//                     else{
//                         candies[j]=candies[j-1]+1;
//                     }
//                     currentmax=ratings[j];
//                 }
//             }
//             if(currentmax==maxRating){
//                 return sum(candies);
//             }
//             maxRating=Math.max(currentmax,maxRating);
//         }
//         return sum(candies);
//     }
//     public int sum(int arr[]){
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=arr[i];
//         }
//         return sum;
//     }
// }

    public int candy(int[] ratings) {
        int max=0;
        int candies[]=new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            candies[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                candies[i-1]=Math.max(candies[i]+1,candies[i-1]);
            }
            max+= candies[i-1];
        }
        return max + candies[ratings.length-1];         
    }
}