class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st=new Stack<>();
        int n=asteroids.length;
        
        for(int i=0;i<n;i++){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0){
                if(st.peek()<Math.abs(asteroids[i])){
                   st.pop();
                    continue;
                }
                else if(st.peek()==Math.abs(asteroids[i])){
                    st.pop();}
                
                destroyed=true;
                break;
            }
            if(destroyed==false){
                st.push(asteroids[i]);
            }
        }
        int[] arr=new int[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
return arr;
    }
}