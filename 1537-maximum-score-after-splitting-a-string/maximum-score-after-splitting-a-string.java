class Solution {
    public int maxScore(String s) {
        int sumone=0;
        int maxscore=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                sumone+=1;
            }
        }
        
        int sumzero=0;
        for(int i=0;i<s.length()-1;i++){ 
            if(s.charAt(i)=='0'){
                sumzero++;;
            }
            else{
                sumone--;
            }
            maxscore=Math.max(maxscore,sumzero+sumone);
        }
        return maxscore;
    }
}