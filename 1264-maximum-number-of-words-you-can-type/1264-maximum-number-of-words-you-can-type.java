class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(words[i].contains(Character.toString(brokenLetters.charAt(j)))){
                    count++;
                    break;
                }
            }
        }
        return words.length-count;
    }
}