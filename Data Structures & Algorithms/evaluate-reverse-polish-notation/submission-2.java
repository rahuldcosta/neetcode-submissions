class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st= new Stack<>();

        for(int i =0;i<tokens.length;i++){
            // System.out.println("tokens[i]:"+tokens[i]);

           
            if((!tokens[i].equals("+")) &&(!tokens[i].equals("-") )&&(!tokens[i].equals("*")) &&(!tokens[i].equals("/"))){
                st.push(Integer.valueOf(tokens[i]));
            }else{
                if(tokens[i].equals("+"))
                {
                    int cur=st.pop()+st.pop();
                   st.push(cur);
                }
                if(tokens[i].equals("/"))
                {
                    int cur=st.pop();
                    int scur=st.pop();
                   st.push(scur/cur);
                }
                if(tokens[i].equals("-"))
                {
                    int cur=st.pop();
                    int scur=st.pop();
                   st.push(scur-cur);
                }
                if(tokens[i].equals("*"))
                {
                    int cur=st.pop()*st.pop();
                   st.push(cur);
                }
            }
        }


        return st.pop();
    }
}
