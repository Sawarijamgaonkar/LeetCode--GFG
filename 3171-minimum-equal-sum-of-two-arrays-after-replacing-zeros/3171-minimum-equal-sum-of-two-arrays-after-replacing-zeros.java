class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1=0;
        long sum2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                sum1+=1;
                count1++;
            }
            else{
                sum1+=nums1[i];
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                sum2+=1;
                count2++;
            }
            else{
                sum2+=nums2[i];
            }
        }
        if(sum1==sum2){
            return sum1;
        }
        if(sum1<=sum2 && count1!=0){
            return sum2;
        }
        else if(sum2<sum1 && count2!=0){
            return sum1;
        }
        return -1;
    }
}

