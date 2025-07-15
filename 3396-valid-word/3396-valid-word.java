class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        int vowelCount=0;
        int consCount=0;
        for(char ch:word.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch)!=-1){
                    vowelCount++;
                }
                else{
                    consCount++;
                }
            }
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        return vowelCount>=1 && consCount>=1;
    }
}