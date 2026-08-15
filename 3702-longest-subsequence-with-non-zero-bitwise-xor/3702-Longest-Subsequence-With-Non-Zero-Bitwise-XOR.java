class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=0;
        boolean nonZero=false;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
            if(nums[i]!=0){
                nonZero=true;
            }
        }

        if(ans>0){
            return nums.length;
        }else{
            if(!nonZero){
                return 0;
            }else{
                return nums.length-1;
            }
        }
    }
}