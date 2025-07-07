class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        // String s=String.valueOf(x);
        // for(int i=0;i<s.length()/2;i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        //         return false;
        //     }
        // }
        // return true;
        int rev=0;
        int num=x;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        return (x==rev);
    }
}