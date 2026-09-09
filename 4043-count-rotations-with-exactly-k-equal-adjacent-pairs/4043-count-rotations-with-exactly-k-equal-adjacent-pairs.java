class Solution {
    public int countRotations(String s, int k) {
       
        int count2=0;
        String str="";
        for(int i=0;i<s.length();i++){
            int count=0;
            str = s.substring(i) + s.substring(0,i);
            for(int j=1;j<str.length();j++){
                if(str.charAt(j-1) == str.charAt(j)){
                    count++;
                }
            }
            if(count==k){
                count2++;
            }
        }
        return count2;
    }
}