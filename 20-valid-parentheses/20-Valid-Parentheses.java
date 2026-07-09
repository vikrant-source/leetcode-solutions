class Solution {
    public boolean isValid(String s) {
        Deque<Character>st=new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')st.push(')');
            else if(ch=='{')st.push('}');
            else if(ch=='[')st.push(']');
            else{
                if(st.isEmpty()||st.pop()!=ch){
                    return false;
                }
            }
        }
        return st.isEmpty();


        // Deque<Character> st = new ArrayDeque<>();
        // for(char ch:s.toCharArray()){
        //     if(ch=='('||ch=='['||ch=='{'){
        //         st.push(ch);
        //     }else{
        //         if(st.isEmpty()) return false;
        //         char tp=st.peek();
        //         if(ch==')' && tp=='(') st.pop();
        //         else if(ch==']' && tp=='[') st.pop();
        //         else if(ch=='}' && tp=='{') st.pop();
        //         else return false;
        //     }
        // }
        // return st.isEmpty();
    }
}