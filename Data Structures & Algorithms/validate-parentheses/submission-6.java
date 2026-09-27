class Solution {
    public boolean isValid(String s) {
          if(s.length()==1){
            return false;
          }

        Stack<Character> st = new Stack<>();
      
        for(char i : s.toCharArray()){
            if(st.empty() && (i==')' || i==']' || i=='}' )){
                return false;
            }

            if(i=='('|| i=='[' || i=='{'){
                st.push(i);
            }

            else if( (i==')' && st.peek()=='(') || (i==']' && st.peek()=='[')|| (st.peek()=='{'&& i=='}')){
                st.pop();
        
            }
            else{
                return false;
            }
            
        }
        return st.empty();
    }
}
