class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st= new Stack<>();
        int[] res= new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }else{
                // System.out.println("st.peek():"+st.peek());
                // System.out.println("temperatures[st.peek()]:"+temperatures[st.peek()]);
                // System.out.println("temperatures[i]"+temperatures[i]);
                while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    
                    res[st.peek()]=i-st.peek();
                    // System.out.println("res[st.peek()]:"+res[st.peek()]);
                    st.pop();
                    
                }
                    st.push(i);
            
            }
        }
        return res;
    }
}
