class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }else{
                char tp=st.peek();
                if(ch==')' && tp=='(') st.pop();
                else if(ch==']' && tp=='[') st.pop();
                else if(ch=='}' && tp=='{') st.pop();
            }
        }
        return st.isEmpty();
    }
}