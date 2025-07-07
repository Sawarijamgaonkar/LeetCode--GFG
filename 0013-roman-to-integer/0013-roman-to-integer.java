class Solution {
    public int romanToInt(String s) {
        StringBuffer str=new StringBuffer(s);
        int ans=0;
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='I'){
                num=1;
            }
            if(s.charAt(i)=='V'){
                num=5;
            }
            if(s.charAt(i)=='X'){
                num=10;
            }
            if(s.charAt(i)=='L'){
                num=50;
            }
            if(s.charAt(i)=='C'){
                num=100;
            }
            if(s.charAt(i)=='D'){
                num=500;
            }
            if(s.charAt(i)=='M'){
                num=1000;
            }
            if (4 * num < ans)
                ans -= num;
            
            else
                ans += num;
            
        }
        return ans;
    }
}