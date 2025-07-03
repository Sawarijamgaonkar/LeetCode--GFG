class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String last=strs[strs.length-1];
        int index=0;
        while(index<s1.length() && index<last.length()){
            if(s1.charAt(index)==last.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return s1.substring(0,index);
    }
}