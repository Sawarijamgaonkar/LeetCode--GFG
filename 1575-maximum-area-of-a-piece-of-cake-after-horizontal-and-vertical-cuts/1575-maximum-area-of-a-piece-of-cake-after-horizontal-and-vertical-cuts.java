class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int maxh=Math.max(horizontalCuts[0],h-horizontalCuts[horizontalCuts.length-1]);
        int maxv=Math.max(verticalCuts[0],w-verticalCuts[verticalCuts.length-1]);
        for(int i=0;i<horizontalCuts.length-1;i++){
            maxh=Math.max(maxh,horizontalCuts[i+1]-horizontalCuts[i]);
        }
        for(int i=0;i<verticalCuts.length-1;i++){
            maxv=Math.max(maxv,verticalCuts[i+1]-verticalCuts[i]);
        }
        return (int)((long)maxh*maxv%1000000007);
    }
}