class Solution {
    public long minimumSteps(String s) {
        long count=0;
        long ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                count++;
            }else{
                ans+=count;
            }
        }

        return ans;
    }
}