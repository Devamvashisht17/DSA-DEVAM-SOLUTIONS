class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] diff= new int[1001];
        
        for(int [] trip: trips){
            int person = trip[0];
            int from = trip[1];
            int to= trip[2];

            diff[from]+=person;
            diff[to]-=person;

        }
        int current=0;
        for(int i=0;i<1000;i++){
            current+=diff[i];
        
        if(capacity< current){
            return false;
        }
        }
        return true;
    }

}