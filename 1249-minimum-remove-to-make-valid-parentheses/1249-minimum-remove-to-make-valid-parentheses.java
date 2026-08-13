class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st= new Stack<>();
        boolean[] remove= new boolean[s.length()];

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(ch=='('){
                st.push(i);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    remove[i]=true;
                }
            }
        }
        while(!st.isEmpty()){
            remove[st.pop()]=true;
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!remove[i]){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}