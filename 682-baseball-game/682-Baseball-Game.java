class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer>st=new ArrayDeque<>();

        int ans=0; 

        for(String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                int val=a+b;
                st.push(val);
                ans+=val;
            }else if(s.equals("D")){
                int val=st.peek()*2;
                st.push(val);
                ans+=val;
            }else if(s.equals("C")){
                ans-=st.pop();
            }else{
                int val=Integer.valueOf(s);
                st.push(val);
                ans+=val;
            }
        }

        return ans;
    }
}