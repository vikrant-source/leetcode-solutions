class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;

        for(int i=n-1;i>=n-k;i--){
            sum+=1L*nums[i]*Math.max(1,mul);
            mul--;
        }


        // int i=n-1;
        // while(k-->0){
        //     if(mul>1){
        //         sum+=1L*nums[i]*mul;
        //         mul--;
        //     }
        //     else{
        //         sum+=nums[i];
        //     }
        //     i--;
        // }
        return sum;
    }
}