class Solution {
    public boolean doesAliceWin(String s) {
        int vowelCount=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') return true;
        }
        return false;
    }
}