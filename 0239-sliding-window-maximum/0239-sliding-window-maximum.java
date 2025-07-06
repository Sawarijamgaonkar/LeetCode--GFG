class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // correct approach but time complexity is very high: i.e. O(n*k): so fails:
        //  brute force thinking:
        // if(nums.length==0 ||k==0){
        //     return new int[0];
        // }
        // int[] result=new int[nums.length-k+1];
        // for(int i=0;i<nums.length-k+1;i++){
        //     int max=Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         max=Math.max(max,nums[j]);
        //     }
            
        //     // System.out.println("max = "+i+" " + max);
        //     result[i]=max;
        // }
        // return result;

        // lets try thinking about deque because everyone is solution section is talking about it:
        int[] result=new int[nums.length-k+1];
        Deque<Integer> win = new ArrayDeque<>(); // stores indices
  
        for (int i = 0; i < nums.length; ++i) {
    // remove indices that are out of bound
            while (win.size() > 0 && win.peekFirst() <= i - k) {
                win.pollFirst();
                }
    // remove indices whose corresponding values are less than nums[i]
            while (win.size() > 0 && nums[win.peekLast()] < nums[i]) {
                win.pollLast();
            }
    // add nums[i]
            win.offerLast(i);
    // add to result
            if (i >= k - 1) {
                result[i - k + 1] = nums[win.peekFirst()];
            }
        }
        return result;
    }
}