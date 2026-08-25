class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder str= new StringBuilder();

        for(char ch:s.toCharArray()){
            String num= Integer.toBinaryString((int)ch);
            if(num.length()<8){
                int len= 8-num.length();
                for(int i=0;i<len;i++){
                    str.append('0');
                }
                str.append(num);
            }
            else{
                str.append(num);
            }
        }
        String str1= str.toString();
        String str2=str.reverse().toString();
        return str1.equals(str2);
    }
}