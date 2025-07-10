class Solution {
    public String intToRoman(int num) {
        StringBuilder list= new StringBuilder();
        while(num/1000>0){
            list.append('M');
            num=num-1000;
            // System.out.println(num);
        }
        while(num/500>0){
            int index=0;
            if(Integer.toString(num).charAt(index)=='9'){
                list.append("CM");
                num=num-900;
                // System.out.println(num);
            }
            else{
                list.append("D");
                num=num-500;
                // System.out.println(num);
            }
        }
        while(num/100>0){
            int index=0;
            if( Integer.toString(num).charAt(index)=='4'){
                list.append("CD");
                num=num-400;
                // System.out.println(num);
            }
            else{
                list.append("C");
                num=num-100;
                // System.out.println(num);
            }
        }
        while(num/50>0){
            int index=0;
            if( Integer.toString(num).charAt(index)=='9'){
                list.append("XC");
                num=num-90;
                // System.out.println(num);
            }
            else{
                list.append("L");
                num=num-50;
                // System.out.println(num);
            }
        }
        while(num/10>0){
            int index=0;
            if(Integer.toString(num).charAt(index)=='4'){
                list.append("XL");
                num=num-40;
                // System.out.println(num);
            }
            else{
                list.append("X");
                num=num-10;
                // System.out.println(num);
            }
            
        }
        while(num/5>0){
            // System.out.println("entered");
            int index=0;
            if( Integer.toString(num).charAt(index)=='9'){
                list.append("IX");
                num=num-9;
                if(num==0){
                    return list.toString();
                }
                // System.out.println(num);
            }
            else{
                list.append("V");
                num=num-5;
                // System.out.println(num);
            }
        }
        while(num/1>0){
            int index=0;
            if(Integer.toString(num).charAt(index)=='4'){
                list.append("IV");
                num=num-4;
                // System.out.println(num);
            }
            else{
                list.append("I");
                num=num-1;
                // System.out.println(num);
            }
        }
        return list.toString();
    }
}