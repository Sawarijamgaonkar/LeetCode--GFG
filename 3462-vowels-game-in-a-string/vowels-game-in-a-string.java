class Solution {
    public boolean doesAliceWin(String s) {
        int vowelCount=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u') vowelCount++;
        }
        if(vowelCount==0) return false;
        // if(vowelCount%2!=0) return true;
        return true;
    }
}