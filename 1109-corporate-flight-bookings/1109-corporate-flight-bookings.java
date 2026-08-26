class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] diff= new int[n+1];

        for(int [] booking: bookings){
            int first= booking[0];
            int last= booking[1];
            int seats= booking[2];

            diff[first-1]+=seats;

            if(last<n){
                diff[last]-=seats;
            }
        }
        int [] ans = new int[n];
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=diff[i];
            ans[i]= curr;
        }
        return ans;
    }
}