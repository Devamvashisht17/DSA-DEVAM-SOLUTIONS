class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD =1000000007;
        int n= arr.length; 
        int [] left = new int[n];
        int [] right = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i =0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();

            }
            if(st.isEmpty()){
                left[i] = i+1;
            }
            else{
                left[i] = i -st.peek();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            st.pop();
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] =n-i;
            }
            else{
                right[i] =st.peek() -i;
            }
            st.push(i);

        }
        long sum =0;
        for(int i=0;i<n;i++){
            long total =(long) arr[i] * left[i] * right[i];
            sum= (sum+total)%MOD;
        }
        return (int)sum;

    }
}