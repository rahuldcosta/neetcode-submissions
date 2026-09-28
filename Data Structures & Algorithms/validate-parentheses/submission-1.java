class Solution {
    public boolean isValid(String s) {
       Stack<Character> bracks= new Stack<>();


       for(int i=0;i<s.length();i++){

       if(!bracks.isEmpty() && ( (s.charAt(i)==')' && bracks.peek()=='(') || (s.charAt(i)=='}'  && bracks.peek()=='{') || ( s.charAt(i)==']' && bracks.peek()=='[') ) ){
           bracks.pop();
           continue;
       }
        bracks.push(s.charAt(i));
       }

       if(bracks.isEmpty()) 
       return true;
       else
       return false; 
    }
}
