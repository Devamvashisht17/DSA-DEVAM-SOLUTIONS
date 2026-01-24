class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("^")){
                int b=s.pop();
                int a=s.pop();
                
                switch(ch){
                    case "+": s.push(a+b);
                    break;
                    case "-": s.push(a-b);
                    break;
                    case "*": s.push(a*b);
                    break;
                    case "/": s.push(a/b);
                    break;
                    case "^": s.push((int)Math.pow(a,b));
                    break;
                }
            }
            else{
                s.push(Integer.parseInt(ch));
            }

        }
        return s.pop();
    }
}