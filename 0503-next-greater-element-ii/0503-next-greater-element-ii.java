class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        int [] a= new int[n];
        Stack <Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.empty() && st.peek()<= nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    a[i] =-1;
                }
                else{
                    a[i] = st.peek();
                }
            }
            
            st.push(nums[i%n]);
            
        }
        return a;
    }
}