class Solution {
    public boolean canAliceWin(int n) {
        int i=10;
        int count=0;

        while(n>=i){
            n=n-i;
            i--;
            count++;
        }
        return count%2 ==1;
    }
}