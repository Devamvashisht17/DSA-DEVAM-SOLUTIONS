class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] diff= new int[101];

        for(int [] log: logs){
            int birth= log[0];
            int death= log[1];
            diff[birth-1950]+=1;
            diff[death-1950]-=1;

        }
        int curr=0;
        int max=0;
        int ans=0;
        for(int i=0;i<diff.length;i++){
            curr+=diff[i];

            if(curr>max){
                max=curr;
                ans=1950+i;
            }
        }
        return ans;
    }
}