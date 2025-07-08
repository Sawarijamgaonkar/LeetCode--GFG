class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==1 && haystack.length()==1){
            if(needle.charAt(0)==haystack.charAt(0)){
                return 0;
            }
        }
        for(int i=0;i<=(haystack.length()-needle.length());i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                // System.out.println(haystack.substring(i,i+needle.length()));
                return i;
            }
        }
        return -1;
    }
}