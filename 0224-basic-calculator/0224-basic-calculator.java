class Solution {
    public int calculate(String s) {
        Stack<Integer> st= new Stack<>();
        int number=0;
        int sign=1;
        int result=0;

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(Character.isDigit(ch)){
                number= number*10+(ch-'0');
            }
            else if(ch=='+'){
                result=result+number*sign;
                number=0;
                sign=1;
            }         
            else if(ch=='-'){
                result=result+number*sign;
                number=0;
                sign=-1;
            }
            else if(ch=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }
            else if(ch==')'){
                result=result+number*sign;
                number=0;
                result=result*st.pop();
                result=result+st.pop();
            }
        }
        return result+sign*number;
    }
}