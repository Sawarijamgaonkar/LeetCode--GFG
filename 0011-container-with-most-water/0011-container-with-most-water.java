class Solution {
    public int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int n=height.length;
        int left=0;
        int right=n-1;
        while(left<right){
            maxArea=Math.max(maxArea,((right-left)*(Math.min(height[right],height[left]))));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}