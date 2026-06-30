class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        StringBuilder str= new StringBuilder();
        while(n>0){
            str.append(n & 1);
            n=n>>1;
        }
        str=str.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '1'){
                str.setCharAt(i, '0');
            }
            else{
                str.setCharAt(i, '1');
            }
        }
        String str1= str.toString();
        return Integer.parseInt(str1, 2);
    }
}