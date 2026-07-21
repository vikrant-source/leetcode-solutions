class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
        int ans=0;
        
        while(n-->0){
            if((Integer.bitCount(n))==k){
                ans+=nums.get(n);
            }
        }
        return ans;
    }
}