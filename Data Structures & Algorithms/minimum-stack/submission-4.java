class MinStack {

    Stack<Long> st;
    long min=0L;
    public MinStack() {
        st= new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min=val;
        }
        else {
        st.push(val-min);
        if(val-min<0L) min=val;
        }
    }
    
    public void pop() {
        long poped=st.pop();
        if(poped<0L){
            min= min -poped;
        }

    }
    
    public int top() {
        long top=st.peek();
        if(top>0L){
            return (int) (top+min);
        }else
        return (int) min;
        
    }
    
    public int getMin() {
        return (int) min;
    }
}
