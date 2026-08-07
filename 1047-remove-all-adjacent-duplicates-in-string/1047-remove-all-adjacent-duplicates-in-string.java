class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st= new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder str= new StringBuilder();
        for(char ch: st){
            str.append(ch);
        }
        return str.toString();
    }
}