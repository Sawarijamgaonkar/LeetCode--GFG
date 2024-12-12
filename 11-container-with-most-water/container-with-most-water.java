class Solution {
    public int maxArea(int[] height) {
        
        //time limit exceeded:
//         int right=height.length-1;
//         int left=0;
//         int leftMax=0,rightMax=0,totalwater=0;
//         while(left<=right){
//             if(height[left]<=height[right]){
//                 leftMax=Math.max(leftMax,height[left]);
//                 if(leftMax<=rightMax){
//                     totalwater=Math.max(totalwater,leftMax*(right-left));
//                 }
//                 left++;
//             }
//             else{
//                 if(height[right]>height[left]){
//                     rightMax=Math.max(rightMax,height[right]);
//                     if(rightMax<leftMax){
//                         totalwater=Math.max(totalwater,rightMax*(right-left));
//                     }
//                     right--;
//                 }
//             }
            
//         }
//         return totalwater;
        
        //trying again:
        int right=height.length-1;
        int left=0;
        int maxarea=0;
        while(left<=right){
            int currheight=Math.min(height[left],height[right]);
            int currwidth=right-left;
            maxarea=Math.max(maxarea,currheight*currwidth);
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}