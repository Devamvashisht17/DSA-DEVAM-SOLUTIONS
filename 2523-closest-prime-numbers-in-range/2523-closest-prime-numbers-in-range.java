class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] isPrime= new boolean[right+1];
        for(int i=0;i<=right;i++){
            isPrime[i]=true;
        }
        if(right>=0) isPrime[0]= false;
        if(right>=1) isPrime[1] =false;
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=right;j+=i){
                    isPrime[j]=false;
                }
            }
        }
            int prev=-1;
            int mindiff= Integer.MAX_VALUE;
            int [] res= new int[] {-1, -1};

            for(int i=left;i<=right;i++){
                if(isPrime[i]){
                   if(prev !=-1){
                    int diff= i-prev;
                    if(diff<mindiff){
                        mindiff=diff;
                        res[0]=prev;
                        res[1]=i;
                    }
                   }
                    prev=i;
                }
            }
        return res;
        
    }
}