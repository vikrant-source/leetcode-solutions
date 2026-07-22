class Solution {
    public int totalHammingDistance(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<32;i++){
            int bitCount=0;
            for(int num:nums){
                bitCount+=(num>>i)&1;
            }
            
            total+=bitCount*(n-bitCount);
        }
        return total;
    }

    //Brute force
    // public int totalHammingDistance(int[] nums) {
    //     int ans=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             ans+=Integer.bitCount(nums[i]^nums[j]);
    //         }
    //     }

    //     return ans;
    // }
}