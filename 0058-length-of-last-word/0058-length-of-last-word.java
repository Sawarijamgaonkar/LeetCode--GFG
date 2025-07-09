class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String last=str[str.length-1];
        return last.length();
    }
}