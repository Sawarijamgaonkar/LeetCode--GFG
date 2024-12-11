class Solution {
    public int trap(int[] height) {
        // Stack<Integer>=new Stack<>();
        int suffixMax[]=new int[height.length];
        int prefixMax[]=new int[height.length];
        int totalwater=0;
        prefixMax[0]=height[0];
        suffixMax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length-1;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        }
        for(int i=height.length-2;i>0;i--){
            suffixMax[i]=Math.max(suffixMax[i+1],height[i]);
        }
        for(int i=0;i<height.length-1;i++){
            int leftMax=prefixMax[i]; 
            int rightMax=suffixMax[i];
            if(height[i]<leftMax && height[i]<rightMax){
                totalwater+=Math.min(leftMax,rightMax)-height[i];
            }
        }
        return totalwater;
    }
}