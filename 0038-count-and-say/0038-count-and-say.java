class Solution {
    public String countAndSay(int n) {
        String s="1";

        for(int k=1;k<n;k++){
            StringBuilder str= new StringBuilder();

            for(int i=0;i<s.length();i++){
                int j=i;
                while(j<s.length() && s.charAt(j)== s.charAt(i)){
                    j++;
                }
                str.append(j-i);
                str.append(s.charAt(i));
                i=j-1;
            }
            s=str.toString();
        }
        return s;
    }
}