class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n= asteroids.length;
        for(int i=0;i<n;i++){
            
            int right = asteroids[i];
            boolean destroy = false;
            while(!st.isEmpty() && st.peek()>0 && right <0){
                if(st.peek() < Math.abs(right)){
                st.pop();
                continue;
                }
                else if(st.peek() == Math.abs(right)){
                    st.pop();

                }
                destroy = true;
                break;
            }
            if(!destroy){
                st.push(right);
            }
        }
        int [] arr= new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i] =st.pop();
        }
        return arr;
    }
}