class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
           boolean left=0==i || flowerbed[i-1]==0;
            boolean right=i==flowerbed.length-1 || flowerbed[i+1]==0;
            if(left & right & flowerbed[i]==0){
                flowerbed[i]=1;
                n-=1;
            }
        }
        return n<=0;
    }
}