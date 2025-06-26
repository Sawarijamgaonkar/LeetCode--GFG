class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        // base case:
        if(target>Integer.MAX_VALUE||target<Integer.MIN_VALUE){
            return result;
        }
        if(nums.length<4){
            return result;
        }

        Arrays.sort(nums);
        // 1st element: for case if lengh=4, this a will work for 0
        for(int a=0;a<nums.length-3;a++){
            // if value at this point and next point are same we want to skip it for a/ first value:
            if(a>0 && nums[a]==nums[a-1]){
                continue;
            }
            // now lets find out the second element: here in case of length 4 this would work for value 0 and 1: if a is 0 then this will only have value 1: 
            for(int b=a+1;b<nums.length-2;b++){
                // again skipping same values:
                if(b>a+1 && nums[b]==nums[b-1]){
                    continue;
                }
                // finding 3rd element: value ahead of b is 3rd: in case of 4 length it is 2
                int c=b+1;
                // finding 4th element: value ahead of c and the last value and denoted as d: in case of length 4 it is 3 
                int d=nums.length-1;
                // calculating sum:
                while(c<d){
                    if(((long)nums[a]+nums[b]+nums[c]+nums[d])==target){
                        result.add(Arrays.asList(nums[a],nums[b],nums[c],nums[d]));
                        c++;
                        d--;
                        while(c<d && nums[c]==nums[c-1]){
                            c++;
                        }
                        while(c<d && nums[d]==nums[d+1]){
                            d--;
                        }
                    }
                    else if(((long)nums[a]+nums[b]+nums[c]+nums[d])<target){
                        c++;
                    }
                    else{
                        d--;
                    }
                }
                
            }
        }
        return result;
    }

}