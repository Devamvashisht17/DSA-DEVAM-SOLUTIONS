class Solution {
    public int numPrimeArrangements(int n) {
        long mod = 1000000007;
        long count=0;

        for(int i=2;i<=n;i++){
            boolean prime= true;

            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
            }
        }
        long primefact= 1;
        long nonprimefact=1;

        for(int i=1;i<=count;i++){
            primefact=  (primefact*i) % mod;
        }
        for(int i=1;i<=n-count;i++){
            nonprimefact = (nonprimefact*i) % mod;
        }
        return (int) ((primefact * nonprimefact) %mod);
    }
}