class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println(s);
        // int left=0;
        // int right=s.length()-1;
        // while(left<right){
        //     if(s.charAt(left)!=s.charAt(right)){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }        
        }
        return true;
    }
}