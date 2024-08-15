class Solution {
    public int removeElement(int[] nums, int val) {
        // int k=0;
        // int n=nums.length;
        // int[] modified=new int[n];
        // int i=0;
        // for(i=0;i<n;i++){
        //     if(i<n & nums[i]!=val){
        //     modified[k]=nums[i];
        //     k++;
        //     }
        // }
        
        // for(int j=0;j<n;j++){
        //     nums[j]=modified[j];
        //     System.out.println(nums[j]);
        // }
        // return k;

        //optimized sol:
        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
            if(j<n& nums[j]!=val){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }   
        }
        return i;
    }
}