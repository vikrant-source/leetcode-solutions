class Solution {
    public int minLength(String s) {
        Deque<Character>stack=new ArrayDeque<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack.isEmpty()&&ch=='B' && stack.peek()=='A'){
                stack.pop();
            }else if(!stack.isEmpty()&&ch=='D' && stack.peek()=='C'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}