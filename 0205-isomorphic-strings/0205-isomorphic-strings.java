class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a= new int [256];
        int[] b= new int [256];

        for(int i =0;i<s.length();i++){
            char ch1= s.charAt(i);
            char ch2= t.charAt(i);
            
            if(a[ch1] != b[ch2]){
                return false;
            }
            a[ch1]= i+1;
            b[ch2]=i+1;
        }
        return true;
    }
}