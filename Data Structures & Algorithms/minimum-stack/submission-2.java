class MinStack {

    Stack<Integer> st;
    TreeMap<Integer,Integer> sortedSet= new TreeMap<>();
    public MinStack() {
        st= new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        sortedSet.put(val,sortedSet.getOrDefault(val,0)+1);
    }
    
    public void pop() {
        int poped=st.pop();
        sortedSet.put(poped,sortedSet.getOrDefault(poped,0)-1);
        if(sortedSet.getOrDefault(poped,0)==0){
            sortedSet.remove(poped);
        }

    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        Map.Entry<Integer, Integer> first = sortedSet.firstEntry();
        return first.getKey();
    }
}
