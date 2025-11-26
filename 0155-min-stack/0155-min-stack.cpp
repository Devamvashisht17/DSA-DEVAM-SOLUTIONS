class MinStack {
public:
    stack<long long > st;
    long long mini;
    MinStack() {
        mini= LLONG_MAX;
    }
    
    void push(int val) {
        long long x =val;
        if(st.empty()){
            st.push(val);
            mini=val;
        }
        else{
            if(val<mini){
                long long encode = 2*x - mini;
                st.push(encode);
                mini=x;
            }
            else{
                st.push(x);
            }
        }
    }
    
    void pop() {
        long long topval = st.top();
        st.pop();

        if(topval <mini){
            mini= 2*mini - topval;
        }
        }
    
    int top() {
        long long topval =st.top();

        if(topval < mini){
            return mini;
        }
        return topval;
    }
    
    int getMin() {
        return mini;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */