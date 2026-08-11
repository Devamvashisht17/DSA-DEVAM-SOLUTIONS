class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String ch= tokens[i];

            if(!ch.equals("*") && !ch.equals("/") && !ch.equals("+") && !ch.equals("-")){
                st.push(Integer.valueOf(ch));
            }
            else{
                int b=st.pop();
                int a= st.pop();

                switch(ch){
                    case "+":
                    st.push(a+b);
                    break;

                    case "-":
                    st.push(a-b);
                    break;

                    case "*":
                    st.push(a*b);
                    break;

                    case "/":
                    st.push(a/b);
                    break;
                }
            }
        }
        return st.peek();
    }
}