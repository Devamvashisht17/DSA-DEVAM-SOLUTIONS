class Solution {
    public int findComplement(int num) {
        StringBuilder str= new StringBuilder();
        while(num>0){
            str.append(num & 1);
            num=num>>1;
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