class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st= new Stack<>();
        int n= temperatures.length;
        int [] a= new int[n];

        for(int i=0;i<n;i++){
        while(!st.isEmpty() && temperatures[i]> temperatures[st.peek()]){
            int lastInd=st.pop();
            a[lastInd]= i - lastInd;

        }
        st.push(i);
        }
        return a;
    }
}