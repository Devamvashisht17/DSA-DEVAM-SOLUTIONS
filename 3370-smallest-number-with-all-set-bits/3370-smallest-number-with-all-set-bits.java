class Solution {
    public int smallestNumber(int n) {
        String str="";
        while(n>0){
            str+= n & 1;
            n=n>>1;

        }
        int num= str.length();
        int found=(int)Math.pow(2,num);
        return found-1;
    }
}