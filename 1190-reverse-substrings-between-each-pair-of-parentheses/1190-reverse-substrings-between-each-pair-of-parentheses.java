class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st= new Stack<>();

        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(ch=='('){
                st.push(str.toString());
                str= new StringBuilder();
            }
            else if(ch == ')'){
                str.reverse();
                String temp= st.pop();
                str= new StringBuilder(temp+ str.toString());
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}