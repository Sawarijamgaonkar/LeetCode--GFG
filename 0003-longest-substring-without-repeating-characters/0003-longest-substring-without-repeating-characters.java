class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        Set<Character> set=new HashSet<>();
        int maxWindow=0;
        for(int right=0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxWindow=Math.max(maxWindow,right-left+1);
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return maxWindow;
    }
}