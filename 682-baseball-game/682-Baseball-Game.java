class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer>st=new ArrayDeque<>();

        for(String s:operations){
            if(s.equals("+")){
                int a=st.peek();
                st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }else if(s.equals("D")){
                st.push(st.peek()*2);
            }else if(s.equals("C")){
                st.pop();
            }else{
                st.push(Integer.valueOf(s));
            }
        }

        int ans=0;

        while(st.size()!=0){
            ans+=st.peek();
            st.pop();
        }

        return ans;
    }
}