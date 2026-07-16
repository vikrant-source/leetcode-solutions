class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];

        for(char ch:s.toCharArray()){
            int pos=ch-'a';
            freq[pos]++;
            if(freq[pos]>=3){
                freq[pos]-=2;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=freq[i];
        }

        return ans;
    }
}